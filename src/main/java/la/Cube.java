package la;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class Cube {
	public void erstelleCube(Location loc, int length, int breite, int hoehe) {

		int x1 = loc.getBlockX();
		int y1 = loc.getBlockY();
		int z1 = loc.getBlockZ();
		System.out.println("Ich bin gerade an x: " + x1 + ", y:" + y1 + ", z:" + z1);

		int length1 = 10;

		int x2 = x1 + length;
		int y2 = y1 + hoehe;
		int z2 = z1 + breite;

		World world = loc.getWorld();
		System.out.println( " x2: " + x2);
		if (length > 0) {
			System.out.println("Baue rechts");
			for (int xPoint = x1; xPoint < x2; xPoint++) {
				inneresForA(y1, z1, length1, y2, z2, world, xPoint, breite, hoehe);
			}
		} else {
			System.out.println("Baue links");
			for (int xPoint = x1; xPoint < x2; xPoint--) {
				inneresForA(y1, z1, length1, y2, z2, world, xPoint, breite, hoehe);
			}
		}

	}

	private void inneresForA(int y1, int z1, int length1, int y2, int z2, World world, int xPoint, int breite, int Höhe) {
		if (Höhe > 0) {
			System.out.println("Baue hoch");
			for (int yPoint = y1; yPoint < y2; yPoint++) {
				inneresForB(z1, length1, z2, world, xPoint, yPoint, breite);
			}
		}
		else {
			System.out.println("Baue runter");
			for (int yPoint = y1; yPoint < y2; yPoint--) {
				inneresForB(z1, length1, z2, world, xPoint, yPoint, breite);
			}
		}
	}

	private void inneresForB(int z1, int length1, int z2, World world, int xPoint, int yPoint, int breite) {
		if (breite > 0) {
			System.out.println("Baue vor");
			for (int zPoint = z1; zPoint < z2; zPoint++) {
				inneresterDing(length1, world, xPoint, yPoint, zPoint);
			}
		} else {
			System.out.println("Baue zurück");
			for (int zPoint = z1; zPoint < z2; zPoint--) {
				inneresterDing(length1, world, xPoint, yPoint, zPoint);
			}
		}
	}

	private void inneresterDing(int length1, World world, int xPoint, int yPoint, int zPoint) {
		Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);

		currentBlock.setType(Material.STONE);
		if (yPoint % 2 == 0) {
			currentBlock.setType(Material.STONE); 
		}
	}
//
//	public void gugunlerCubeOriginal(Location loc, int length, int breite, int Höhe) {
//
//		int x1 = loc.getBlockX();
//		int y1 = loc.getBlockY();
//		int z1 = loc.getBlockZ();
//		System.out.println("Ich bin gerade an x: " + x1 + ", y:" + y1 + ", z:" + z1);
//
//		int length1 = 10;
//
//		int x2 = x1 + length;
//		int y2 = y1 + Höhe;
//		int z2 = z1 + breite;
//
//		World world = loc.getWorld();
//
//		if (length > 0) {
//			for (int xPoint = x1; xPoint < x2; xPoint++) {
//
//				if (Höhe > 0) {
//					for (int yPoint = y1; yPoint < y2; yPoint++) {
//
//						if (breite > 0) {
//							for (int zPoint = z1; zPoint < z2; zPoint++) {
//
//								Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
//
//								currentBlock.setType(Material.AIR);
//								if (length1 < 10) {
//									currentBlock.setType(Material.DIAMOND_BLOCK);
//								}
//							}
//						} else {
//							for (int zPoint = z1; zPoint < z2; zPoint--) {
//								Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
//
//								currentBlock.setType(Material.AIR);
//								if (length1 < 10) {
//									currentBlock.setType(Material.DIAMOND_BLOCK);
//								}
//							}
//						}
//					}
//				} else {
//					for (int yPoint = y1; yPoint < y2; yPoint--) {
//						if (breite > 0) {
//							for (int zPoint = z1; zPoint < z2; zPoint++) {
//
//								Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
//
//								currentBlock.setType(Material.AIR);
//								if (length1 < 10) {
//									currentBlock.setType(Material.DIAMOND_BLOCK);
//								}
//							}
//						} else {
//							for (int zPoint = z1; zPoint < z2; zPoint--) {
//								Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
//
//								currentBlock.setType(Material.AIR);
//								if (length1 < 10) {
//									currentBlock.setType(Material.DIAMOND_BLOCK);
//								}
//							}
//						}
//					}
//				}
//			}
//		} else {
//			for (int xPoint = x1; xPoint < x2; xPoint--) {
//				if (Höhe > 0) {
//					for (int yPoint = y1; yPoint < y2; yPoint++) {
//
//						if (breite > 0) {
//							for (int zPoint = z1; zPoint < z2; zPoint++) {
//
//								Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
//
//								currentBlock.setType(Material.AIR);
//								if (length1 < 10) {
//									currentBlock.setType(Material.DIAMOND_BLOCK);
//								}
//							}
//						} else {
//							for (int zPoint = z1; zPoint < z2; zPoint--) {
//								Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
//
//								currentBlock.setType(Material.AIR);
//								if (length1 < 10) {
//									currentBlock.setType(Material.DIAMOND_BLOCK);
//								}
//							}
//						}
//					}
//				} else {
//					for (int yPoint = y1; yPoint < y2; yPoint--) {
//						if (breite > 0) {
//							for (int zPoint = z1; zPoint < z2; zPoint++) {
//
//								Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
//
//								currentBlock.setType(Material.AIR);
//								if (length1 < 10) {
//									currentBlock.setType(Material.DIAMOND_BLOCK);
//								}
//							}
//						} else {
//							for (int zPoint = z1; zPoint < z2; zPoint--) {
//								Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
//
//								currentBlock.setType(Material.AIR);
//								if (length1 < 10) {
//									currentBlock.setType(Material.DIAMOND_BLOCK);
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//	}

}
