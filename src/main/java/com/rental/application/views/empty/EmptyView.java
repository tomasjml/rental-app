package com.rental.application.views.empty;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.rental.application.views.main.MainView;

@Route(value = "Empty", layout = MainView.class)
@PageTitle("Empty")
@CssImport("styles/views/empty/empty-view.css")
public class EmptyView extends Div {

    public EmptyView() {
        setId("empty-view");
        add(new Label("Content placeholder"));
    }

}
