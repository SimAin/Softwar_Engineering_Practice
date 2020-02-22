package game.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import game.scene;

public class sceneTests {

    public sceneTests() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getHeight method, of class Scene.
     */
    @Test
    public void testGetHeight() {
        scene scene = new scene(0, 0);
        assertEquals(0, scene.getHeight ());
    }

    /**
     * Test of getHeight method, of class Scene.
     */
    @Test
    public void testGetHeight5() {
        scene scene2 = new scene(10, 5);
        assertEquals(10, scene2.getHeight ());
    }

    /**
     * Test of getWidth method, of class Scene.
     */
    @Test
    public void testGetWidth() {
        scene scene = new scene(0, 0);
        assertEquals(0, scene.getWidth());
    }

    /**
     * Test of getWidth method, of class Scene.
     */
    @Test
    public void testGetWidth5() {
        scene scene2 = new scene(10, 5);
        assertEquals(5, scene2.getWidth());
    }

    @Test
    public void testAddTerrain() {
        scene scene = new scene (5, 3);
        scene.addTerrain("G", 2, 1);
        scene.addTerrain("T", 4, 2);
        assertEquals("G", scene.getTerrain(2, 1));
        assertEquals("T", scene.getTerrain(4, 2));
    }

    @Test
    public void testSearchTerrain() {
        scene scene = new scene (5, 3);
        scene.addTerrain("G", 2, 1);
        scene.addTerrain("T", 4, 2);
        assertEquals(true, scene.searchItem("G"));
        assertEquals(true, scene.searchItem("T"));
        assertEquals(false, scene.searchItem("M"));
        assertEquals(false, scene.searchItem("U"));
    }

    @Test
    public void testGetDistance() {
        scene scene = new scene (5, 4);
        scene.addDistance(2,1,3,4);
        assertEquals(3, scene.getDistance(2,1,3,4));
        scene scene2 = new scene (55, 44);
        scene2.addDistance(22,11,33,44);
        assertEquals(34, scene2.getDistance(22,11,33,44));
    }

    @Test
    public void testExercise () {
    scene scene = new scene (5, 7);
    scene.addTerrain("A", 0, 0);
    scene.addTerrain("B", 1, 0);
    scene.addTerrain("C", 4, 6);
    scene.addTerrain("D", 0, 6);
    scene.addTerrain("E", 4, 0);
    scene.addTerrain("F", 2, 2);
    scene.addTerrain("G", 3, 3);
    scene.addTerrain("H", 2, 0);
    scene.addTerrain("I", 3, 6);
    scene.addTerrain("J", 4, 1);
    assertEquals(10, scene.countItems(2, 3, 10));
    assertEquals(2, scene.countItems(0,0, 1));
    }
}