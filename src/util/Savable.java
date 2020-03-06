package util;

import java.io.File;
import java.util.List;

public interface Savable {
    public void add(String new);
    public String load(int id);
    public void update(int id, String update);
    public void delete(int id);
}
