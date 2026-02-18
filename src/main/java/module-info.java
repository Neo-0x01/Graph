module org.example.graph {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens org.example.graph to javafx.fxml;
    exports org.example.graph;
    exports org.example.graph.app;
    opens org.example.graph.app to javafx.fxml;
    exports org.example.graph.model;
    opens org.example.graph.model to javafx.fxml;
    exports org.example.graph.projection;
    opens org.example.graph.projection to javafx.fxml;
    exports org.example.graph.object;
    opens org.example.graph.object to javafx.fxml;
    exports org.example.graph.config;
    opens org.example.graph.config to javafx.fxml;
}