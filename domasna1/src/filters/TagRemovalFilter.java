package filters;

import models.CulturalHeritage;
import models.Node;

import java.util.List;
import java.util.stream.Collectors;

public class TagRemovalFilter implements Filter<List<Node>, List<CulturalHeritage>> {

    @Override
    public List<CulturalHeritage> execute(List<Node> input) {
        return input.stream()
                .map(node -> new CulturalHeritage(
                        node.getProperty("name"),
                        node.lat,
                        node.lon,
                        node.getProperty("historic"),
                        node.getProperty("tourism"))).collect(Collectors.toList());

    }

}
