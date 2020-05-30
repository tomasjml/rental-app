package com.rental.app.views.empty;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.rental.app.views.main.MainView;

@Route(value = "empty", layout = MainView.class)
@PageTitle("Empty")
@CssImport("styles/views/empty/empty-view.css")
public class EmptyView extends Div {

    public EmptyView() {
        setId("empty-view");
        add(new Label("Content placeholder"));
    }

}
