import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class triangleSum {
private static int heightOfTree = 100;
private final String fileName = "problem_67.in";
private int[][] tree;

public int maxValue() throws IOException {
readTree();

for (int i = triangleSum.heightOfTree - 2; i >= 0; i--)
for (int j = 0; j <= i; j++)
tree[i][j] += tree[i + 1][j] > tree[i + 1][j + 1] ? tree[i + 1][j] : tree[i + 1][j + 1];

return tree[0][0];
}

private void readTree() throws IOException {
tree = new int[triangleSum.heightOfTree][];

BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
for (int i = 0; i < triangleSum.heightOfTree; i++) {
tree[i] = new int[i + 1];
String[] values = bufferedReader.readLine().split(" ");
for (int j = 0; j <= i; j++)
tree[i][j] = Integer.parseInt(values[j]);
}
}

public static void main(String[] args) throws IOException {
System.out.println(new triangleSum().maxValue());
}
}