/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the reporting and advicing of the cash side of any
 * financial transactions, including cash movements, transactions and balances,
 * plus any exceptions and investigations related to cash transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "camt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04
 * FundDetailedEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04
 * FundConfirmedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03
 * FundDetailedConfirmedCashForecastReportCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04
 * FundEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03
 * FundConfirmedCashForecastReportCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04
 * FundDetailedConfirmedCashForecastReportV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cash Management - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions."
 * </li>
 * </ul>
 */
public class CashManagementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cash Management - Latest version - master";
				definition = "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions.";
				code = "camt";
				messageDefinition_lazy = () -> Arrays.asList(FundDetailedEstimatedCashForecastReportV04.mmObject(), FundConfirmedCashForecastReportV04.mmObject(), FundDetailedConfirmedCashForecastReportCancellationV03.mmObject(),
						FundEstimatedCashForecastReportV04.mmObject(), FundConfirmedCashForecastReportCancellationV03.mmObject(), FundDetailedConfirmedCashForecastReportV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}