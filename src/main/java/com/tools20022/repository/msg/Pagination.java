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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.colr.CollateralAndExposureReportV03;
import com.tools20022.repository.area.colr.InterestPaymentStatementV04;
import com.tools20022.repository.area.reda.PriceReportCancellationV04;
import com.tools20022.repository.area.reda.PriceReportV04;
import com.tools20022.repository.area.secl.MarginReportV02;
import com.tools20022.repository.area.secl.NetPositionV03;
import com.tools20022.repository.area.secl.SettlementObligationReportV03;
import com.tools20022.repository.area.secl.TradeLegStatementV03;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.setr.SwitchOrderV04;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Number used to sequence pages when it is not possible for data to be conveyed
 * in a single message and the data has to be split across several pages
 * (messages).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Pagination#mmPageNumber
 * Pagination.mmPageNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Pagination#mmLastPageIndicator
 * Pagination.mmLastPageIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmMessagePagination
 * PriceReportCancellationV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmMessagePagination
 * PriceReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmMessagePagination
 * AccountingStatementOfHoldingsV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmMessagePagination
 * CustodyStatementOfHoldingsV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#mmMessagePagination
 * AccountingStatementOfHoldingsCancellationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmMessagePagination
 * CustodyStatementOfHoldingsCancellationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmPagination
 * SecuritiesEndOfProcessReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmPagination
 * TotalPortfolioValuationReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmPagination
 * MarginReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmMessagePagination
 * FundDetailedEstimatedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmMessagePagination
 * FundConfirmedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmMessagePagination
 * FundDetailedConfirmedCashForecastReportCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmMessagePagination
 * FundEstimatedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmMessagePagination
 * StatementOfInvestmentFundTransactionsV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmMessagePagination
 * FundConfirmedCashForecastReportCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmMessagePagination
 * StatementOfInvestmentFundTransactionsCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmMessagePagination
 * FundDetailedConfirmedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmPagination
 * NetPositionV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegStatementV03#mmPagination
 * TradeLegStatementV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.SettlementObligationReportV03#mmPagination
 * SettlementObligationReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09#mmPagination
 * SecuritiesBalanceCustodyReportV09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmPagination
 * SecuritiesBalanceAccountingReportV09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV03#mmPagination
 * SecuritiesSettlementTransactionAuditTrailReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV04#mmPagination
 * InterestPaymentStatementV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmPagination
 * CollateralAndExposureReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmPagination
 * SecuritiesBalanceTransparencyReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmMessagePagination
 * SwitchOrderV04.mmMessagePagination}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Pagination"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Pagination1 Pagination1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Pagination", propOrder = {"pageNumber", "lastPageIndicator"})
public class Pagination {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PgNb", required = true)
	protected Max5NumericText pageNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Page number."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Pagination1#mmPageNumber
	 * Pagination1.mmPageNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Pagination, Max5NumericText> mmPageNumber = new MMMessageAttribute<Pagination, Max5NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
			isDerived = false;
			xmlTag = "PgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PageNumber";
			definition = "Page number.";
			nextVersions_lazy = () -> Arrays.asList(Pagination1.mmPageNumber);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Max5NumericText getValue(Pagination obj) {
			return obj.getPageNumber();
		}

		@Override
		public void setValue(Pagination obj, Max5NumericText value) {
			obj.setPageNumber(value);
		}
	};
	@XmlElement(name = "LastPgInd", required = true)
	protected YesNoIndicator lastPageIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastPgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastPageIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the last page."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Pagination1#mmLastPageIndicator
	 * Pagination1.mmLastPageIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Pagination, YesNoIndicator> mmLastPageIndicator = new MMMessageAttribute<Pagination, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
			isDerived = false;
			xmlTag = "LastPgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPageIndicator";
			definition = "Indicates the last page.";
			nextVersions_lazy = () -> Arrays.asList(Pagination1.mmLastPageIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Pagination obj) {
			return obj.getLastPageIndicator();
		}

		@Override
		public void setValue(Pagination obj, YesNoIndicator value) {
			obj.setLastPageIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Pagination.mmPageNumber, com.tools20022.repository.msg.Pagination.mmLastPageIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(PriceReportCancellationV04.mmMessagePagination, PriceReportV04.mmMessagePagination, AccountingStatementOfHoldingsV02.mmMessagePagination,
						CustodyStatementOfHoldingsV02.mmMessagePagination, AccountingStatementOfHoldingsCancellationV02.mmMessagePagination, CustodyStatementOfHoldingsCancellationV02.mmMessagePagination,
						SecuritiesEndOfProcessReportV01.mmPagination, TotalPortfolioValuationReportV01.mmPagination, MarginReportV02.mmPagination, FundDetailedEstimatedCashForecastReportV04.mmMessagePagination,
						FundConfirmedCashForecastReportV04.mmMessagePagination, FundDetailedConfirmedCashForecastReportCancellationV03.mmMessagePagination, FundEstimatedCashForecastReportV04.mmMessagePagination,
						StatementOfInvestmentFundTransactionsV03.mmMessagePagination, FundConfirmedCashForecastReportCancellationV03.mmMessagePagination, StatementOfInvestmentFundTransactionsCancellationV03.mmMessagePagination,
						FundDetailedConfirmedCashForecastReportV04.mmMessagePagination, NetPositionV03.mmPagination, TradeLegStatementV03.mmPagination, SettlementObligationReportV03.mmPagination,
						SecuritiesBalanceCustodyReportV09.mmPagination, SecuritiesBalanceAccountingReportV09.mmPagination, SecuritiesSettlementTransactionAuditTrailReportV03.mmPagination, InterestPaymentStatementV04.mmPagination,
						CollateralAndExposureReportV03.mmPagination, SecuritiesBalanceTransparencyReportV02.mmPagination, SwitchOrderV04.mmMessagePagination);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Pagination";
				definition = "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages).";
				nextVersions_lazy = () -> Arrays.asList(Pagination1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max5NumericText getPageNumber() {
		return pageNumber;
	}

	public Pagination setPageNumber(Max5NumericText pageNumber) {
		this.pageNumber = Objects.requireNonNull(pageNumber);
		return this;
	}

	public YesNoIndicator getLastPageIndicator() {
		return lastPageIndicator;
	}

	public Pagination setLastPageIndicator(YesNoIndicator lastPageIndicator) {
		this.lastPageIndicator = Objects.requireNonNull(lastPageIndicator);
		return this;
	}
}