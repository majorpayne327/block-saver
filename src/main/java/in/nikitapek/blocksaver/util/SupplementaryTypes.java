package in.nikitapek.blocksaver.util;

import in.nikitapek.blocksaver.serialization.PlayerInfo;
import in.nikitapek.blocksaver.serialization.Reinforcement;
import in.nikitapek.blocksaver.serialization.WorldContainer;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import org.bukkit.Location;
import org.bukkit.Material;

import com.google.gson.reflect.TypeToken;
import org.bukkit.World;

public final class SupplementaryTypes {
    @SuppressWarnings("rawtypes")
    public static final Type TREESET = new TypeToken<TreeSet>() {}.getType();

    public static final Type INTEGER = new TypeToken<Integer>() {}.getType();
    public static final Type LIST = new TypeToken<List<?>>() {}.getType();
    public static final Type LOCATION = new TypeToken<Location>() {}.getType();
    public static final Type MATERIAL = new TypeToken<Material>() {}.getType();
    public static final Type PLAYER_INFO = new TypeToken<PlayerInfo>() {}.getType();
    public static final Type REINFORCEMENT = new TypeToken<Reinforcement>() {}.getType();
    public static final Type STRING = new TypeToken<String>() {}.getType();
    public static final Type WORLD_CONTAINER = new TypeToken<WorldContainer>() {}.getType();
    public static final Type HASH_MAP = new TypeToken<HashMap>() {}.getType();

    private SupplementaryTypes() {}
}
