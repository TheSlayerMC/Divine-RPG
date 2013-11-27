package net.divinerpg.arcana.gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraft.world.gen.FlatGeneratorInfo;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenStructure;

public class ChunkProviderArcana implements IChunkProvider{

	private ArrayList<Object> Rooms;
	private DungeonCeiling Ceiling;
	private World worldObj;
	private Random random;
    private final FlatGeneratorInfo flatGenerator;
    private final byte[] cachedBlockIDs = new byte[256];
    private final byte[] cachedBlockMetadata = new byte[256];
    private final List structureGenerators = new ArrayList();

	
	public ChunkProviderArcana(World world, long seed, String flatGeneratorString){
		
		worldObj = world;
        random = new Random(seed);
        flatGenerator = FlatGeneratorInfo.createFlatGeneratorFromString(flatGeneratorString);
        
		Rooms = new ArrayList<Object>(22);

        Rooms.add(new DungeonComponent());
        Rooms.add(new DungeonComponent1());
        Rooms.add(new DungeonComponent2());
        Rooms.add(new DungeonComponent3());
        Rooms.add(new DungeonComponent4());
        Rooms.add(new DungeonComponent5());
        Rooms.add(new DungeonComponent6());
        Rooms.add(new DungeonComponent7());
        Rooms.add(new DungeonComponent9());
        Rooms.add(new DungeonComponent10());
        Rooms.add(new DungeonComponent11());
        Rooms.add(new DungeonComponent12());
        Rooms.add(new DungeonComponent13());
        Rooms.add(new DungeonComponent14());
        Rooms.add(new DungeonComponent15());
        Rooms.add(new DungeonComponent16());
        Rooms.add(new DungeonComponent17());
        Rooms.add(new DungeonComponent22());
        Rooms.add(new DungeonComponenet18());
        Rooms.add(new DungeonComponenet19());
        Rooms.add(new DungeonComponent8());
        Rooms.add(new DungeonComponent20());
        Rooms.add(new DungeonComponent21());
		Ceiling = new DungeonCeiling();

	}
	
	@Override
	public boolean chunkExists(int i, int j) {	
		return false;
	}

	@Override
	public Chunk provideChunk(int par1, int par2)
    {
        Chunk chunk = new Chunk(this.worldObj, par1, par2);

        for (int k = 0; k < this.cachedBlockIDs.length; ++k)
        {
            int l = k >> 4;
            ExtendedBlockStorage extendedblockstorage = chunk.getBlockStorageArray()[l];

            if (extendedblockstorage == null)
            {
                extendedblockstorage = new ExtendedBlockStorage(k, !this.worldObj.provider.hasNoSky);
                chunk.getBlockStorageArray()[l] = extendedblockstorage;
            }

            for (int i1 = 0; i1 < 16; ++i1)
            {
                for (int j1 = 0; j1 < 16; ++j1)
                {
                    extendedblockstorage.setExtBlockID(i1, k & 15, j1, this.cachedBlockIDs[k] & 255);
                    extendedblockstorage.setExtBlockMetadata(i1, k & 15, j1, this.cachedBlockMetadata[k]);
                }
            }
        }

        chunk.generateSkylightMap();
        BiomeGenBase[] abiomegenbase = this.worldObj.getWorldChunkManager().loadBlockGeneratorData((BiomeGenBase[])null, par1 * 16, par2 * 16, 16, 16);
        byte[] abyte = chunk.getBiomeArray();

        for (int k1 = 0; k1 < abyte.length; ++k1)
        {
            abyte[k1] = (byte)abiomegenbase[k1].biomeID;
        }

        chunk.generateSkylightMap();
        return chunk;
    }

	@Override
	public Chunk loadChunk(int i, int j) {
		return this.provideChunk(i, j);
	}

	@Override
	public void populate(IChunkProvider chunkProvider, int chunkX, int chunkY) {
		
		 int x = chunkX * 16; // X the actual X position in world.
	        int y = chunkY * 16;
	        BiomeGenBase biome = this.worldObj.getBiomeGenForCoords(x + 16, y + 16);
	        boolean flag = false;
	        this.random.setSeed(this.worldObj.getSeed());
	        long var8 = this.random.nextLong() / 2L * 2L + 1L;
	        long var10 = this.random.nextLong() / 2L * 2L + 1L;
	        this.random.setSeed(chunkX * var8 + chunkY * var10 ^ this.worldObj.getSeed());
	        int roomToGenerate;
	        int boosRoomFlag;

	        Random rand = random;
	        Chunk chunk = this.worldObj.getChunkFromChunkCoords(chunkX, chunkY);
	        ArrayList<Object> dungeonRooms = Rooms;

	        for (int i = 1; i < 5; i++)
	        {
	            roomToGenerate = rand.nextInt(23); //# of different rooms to generate
	            boosRoomFlag = rand.nextInt(5); //Chance for boss rooms to generate 1/number specified

	            if (roomToGenerate > 19 && boosRoomFlag != 0 || i > 3) // boss chance
	            {
	                roomToGenerate = rand.nextInt(20);
	            }

	            if (roomToGenerate < 21) //boss rooms have to use world gen while the rest use chunk gen
	            {
	                ((DungeonComponentBase)(dungeonRooms.get(roomToGenerate))).generate(chunk, rand, x, i * 8, y);
	            }
	            else
	            {
	                ((WorldGenerator)(dungeonRooms.get(roomToGenerate))).generate(this.worldObj, rand, x, i * 8, y);
	            }
	        }
	        DungeonCeiling dungeonCeiling = Ceiling;
	        dungeonCeiling.generate(chunk, rand, x, 40, y);//80
	    }
	


	@Override
	public boolean saveChunks(boolean flag, IProgressUpdate iprogressupdate) {
		return true;
	}

	@Override
	public boolean unloadQueuedChunks() {
		return false;
	}

	@Override
	public boolean canSave() {
		return true;
	}

	@Override
	public String makeString() {
		return "Arcana";
	}

	@Override
	public List getPossibleCreatures(EnumCreatureType enumcreaturetype, int i, int j, int k) {
		BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(i, k);
        return biomegenbase == null ? null : biomegenbase.getSpawnableList(enumcreaturetype);
	}

	@Override
	public ChunkPosition findClosestStructure(World world, String s, int i, int j, int k) {
		return null;
	}

	@Override
	public int getLoadedChunkCount() {
		return 0;
	}

	@Override
	public void recreateStructures(int i, int j) {
		Iterator iterator = this.structureGenerators.iterator();

        while (iterator.hasNext())
        {
            MapGenStructure mapgenstructure = (MapGenStructure)iterator.next();
            mapgenstructure.generate(this, this.worldObj, i, j, (byte[])null);
        }
	}

	@Override
	public void saveExtraData() {

	}

}
