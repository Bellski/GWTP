/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.samples.tab.client.gin;

import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.samples.tab.client.MyConstants;
import com.gwtplatform.samples.tab.client.application.ApplicationModule;
import com.gwtplatform.samples.tab.client.application.ApplicationPresenter;
import com.gwtplatform.samples.tab.client.application.ApplicationView;
import com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter;
import com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView;
import com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter;
import com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView;
import com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogPresenterWidget;
import com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabPresenter;
import com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView;
import com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogView;
import com.gwtplatform.samples.tab.client.application.home.HomePresenter;
import com.gwtplatform.samples.tab.client.application.home.HomeView;
import com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter;
import com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView;
import com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter;
import com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView;
import com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupPresenterWidget;
import com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView;
import com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogPresenterWidget;
import com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogSubTabPresenter;
import com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogSubTabView;
import com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView;
import com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter;
import com.gwtplatform.samples.tab.client.application.settings.SettingsView;
import com.gwtplatform.samples.tab.client.place.DefaultPlace;
import com.gwtplatform.samples.tab.client.place.NameTokens;
import com.gwtplatform.samples.tab.client.place.PlaceManager;
import com.gwtplatform.samples.tab.client.security.CurrentUser;
import com.gwtplatform.samples.tab.client.security.IsAdminGatekeeper;

/**
 * @author Christian Goudreau
 */
public class ClientModule extends AbstractPresenterModule {
  @Override
  protected void configure() {
    // Default implementation of standard resources
    install(new DefaultModule(PlaceManager.class));

    bind(MyConstants.class).in(Singleton.class);
    bind(CurrentUser.class).in(Singleton.class);
    bind(IsAdminGatekeeper.class).in(Singleton.class);

    // Constants
    bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.homeNewsPage);

    install(new ApplicationModule());
  }
}
