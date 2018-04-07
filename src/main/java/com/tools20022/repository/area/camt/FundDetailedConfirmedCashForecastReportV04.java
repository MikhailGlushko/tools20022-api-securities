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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A report provider, such as a transfer agent, sends the
 * FundDetailedConfirmedCashForecastReport message to the report user, such as
 * an investment manager or pricing agent, to report the confirmed cash
 * incomings and outgoings, sorted by country, institution name or other
 * criteria defined by the user of one or more share classes of an investment
 * fund on one or more trade dates.<br>
 * The cash movements may result from, for example, redemption, subscription,
 * switch transactions or reinvestment of dividends.<br>
 * <b>Usage</b><br>
 * The FundDetailedConfirmedCashForecastReport is used to provide definitive
 * cash movements, that is, it is sent after the cut-off time and/or the price
 * valuation of the fund. <br>
 * If the price is not yet definitive, then the
 * FundDetailedEstimatedCashForecastReport message must be used.<br>
 * The message structure allows for the following uses:<br>
 * - to provide cash in and cash out amounts for a fund/sub fund and one or more
 * share classes (a FundOrSubFundDetails sequence and one or
 * FundCashForecastDetails sequences are used),<br>
 * - to provide cash in and cash out amounts for one or more share classes (one
 * or more FundCashForecastDetails sequences are used).<br>
 * If the report is to provide cash in and cash out for a fund/sub fund only and
 * not for one or more share classes, then the FundConfirmedCashForecastReport
 * message must be used.<br>
 * The FundDetailedConfirmedCashForecastReport message is used to report cash
 * movements in or out of a fund, organised by party, such as fund management
 * company, country, currency or by some other criteria defined by the report
 * provider. If the report is used to given the cash-in and cash-out for a
 * party, then additional criteria, such as currency and country, can be
 * specified.<br>
 * In addition, the underlying transaction type for the cash-in or cash-out
 * movement can be specified, as well as information about the cash movement's
 * underlying orders, such as commission and charges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmMessageIdentification
 * FundDetailedConfirmedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmPoolReference
 * FundDetailedConfirmedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmPreviousReference
 * FundDetailedConfirmedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmRelatedReference
 * FundDetailedConfirmedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmMessagePagination
 * FundDetailedConfirmedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmFundOrSubFundDetails
 * FundDetailedConfirmedCashForecastReportV04.mmFundOrSubFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmFundCashForecastDetails
 * FundDetailedConfirmedCashForecastReportV04.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReportV04.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmExtension
 * FundDetailedConfirmedCashForecastReportV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FndDtldConfdCshFcstRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.043.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundDetailedConfirmedCashForecastReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA report provider, such as a transfer agent, sends the FundDetailedConfirmedCashForecastReport message to the report user, such as an investment manager or pricing agent, to report the confirmed cash incomings and outgoings, sorted by country, institution name or other criteria defined by the user of one or more share classes of an investment fund on one or more trade dates.\r\nThe cash movements may result from, for example, redemption, subscription, switch transactions or reinvestment of dividends.\r\nUsage\r\nThe FundDetailedConfirmedCashForecastReport is used to provide definitive cash movements, that is, it is sent after the cut-off time and/or the price valuation of the fund. \r\nIf the price is not yet definitive, then the FundDetailedEstimatedCashForecastReport message must be used.\r\nThe message structure allows for the following uses:\r\n-\tto provide cash in and cash out amounts for a fund/sub fund and one or more share classes (a FundOrSubFundDetails sequence and one or FundCashForecastDetails sequences are used),\r\n-\tto provide cash in and cash out amounts for one or more share classes (one or more FundCashForecastDetails sequences are used).\r\nIf the report is to provide cash in and cash out for a fund/sub fund only and not for one or more share classes, then the FundConfirmedCashForecastReport message must be used.\r\nThe FundDetailedConfirmedCashForecastReport message is used to report cash movements in or out of a fund, organised by party, such as fund management company, country, currency or by some other criteria defined by the report provider. If the report is used to given the cash-in and cash-out for a party, then additional criteria, such as currency and country, can be specified.\r\nIn addition, the underlying transaction type for the cash-in or cash-out movement can be specified, as well as information about the cash movement's underlying orders, such as commission and charges."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundDetailedConfirmedCashForecastReportV04", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "messagePagination", "fundOrSubFundDetails", "fundCashForecastDetails",
		"consolidatedNetCashForecast", "extension"})
public class FundDetailedConfirmedCashForecastReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, Optional<AdditionalReference3>> mmPoolReference = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, Optional<AdditionalReference3> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference3> previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, List<AdditionalReference3>> mmPreviousReference = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, List<AdditionalReference3>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, List<AdditionalReference3> value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected List<AdditionalReference3> relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, List<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, List<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, List<AdditionalReference3> value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "MsgPgntn", required = true)
	protected Pagination messagePagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pagination of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, Pagination> mmMessagePagination = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, Pagination>() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, Pagination value) {
			obj.setMessagePagination(value);
		}
	};
	@XmlElement(name = "FndOrSubFndDtls")
	protected Fund4 fundOrSubFundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Fund4 Fund4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndOrSubFndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrSubFundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the fund/sub fund when the report either specifies cash flow for the fund/sub fund or for a share class of the fund/sub fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, Optional<Fund4>> mmFundOrSubFundDetails = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, Optional<Fund4>>() {
		{
			xmlTag = "FndOrSubFndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOrSubFundDetails";
			definition = "Information about the fund/sub fund when the report either specifies cash flow for the fund/sub fund or for a share class of the fund/sub fund.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Fund4.mmObject();
		}

		@Override
		public Optional<Fund4> getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getFundOrSubFundDetails();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, Optional<Fund4> value) {
			obj.setFundOrSubFundDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FndCshFcstDtls", required = true)
	protected List<FundCashForecast6> fundCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndCshFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the cash-in and cash-out flows for a specific trade date as a result of transactions in shares in an investment fund, for example, subscriptions, redemptions or switches. The information provided is sorted by pre-defined criteria such as country, institution, currency or user defined criteria."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, List<FundCashForecast6>> mmFundCashForecastDetails = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, List<FundCashForecast6>>() {
		{
			xmlTag = "FndCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashForecastDetails";
			definition = "Information related to the cash-in and cash-out flows for a specific trade date as a result of transactions in shares in an investment fund, for example, subscriptions, redemptions or switches. The information provided is sorted by pre-defined criteria such as country, institution, currency or user defined criteria.";
			minOccurs = 1;
			complexType_lazy = () -> FundCashForecast6.mmObject();
		}

		@Override
		public List<FundCashForecast6> getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getFundCashForecastDetails();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, List<FundCashForecast6> value) {
			obj.setFundCashForecastDetails(value);
		}
	};
	@XmlElement(name = "CnsltdNetCshFcst")
	protected NetCashForecast3 consolidatedNetCashForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3
	 * NetCashForecast3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnsltdNetCshFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidatedNetCashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash as a result of the cash-in and cash-out flows specified in the fund cash forecast details."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, Optional<NetCashForecast3>> mmConsolidatedNetCashForecast = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, Optional<NetCashForecast3>>() {
		{
			xmlTag = "CnsltdNetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedNetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified in the fund cash forecast details.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NetCashForecast3.mmObject();
		}

		@Override
		public Optional<NetCashForecast3> getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getConsolidatedNetCashForecast();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, Optional<NetCashForecast3> value) {
			obj.setConsolidatedNetCashForecast(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, List<Extension1>> mmExtension = new MMMessageBuildingBlock<FundDetailedConfirmedCashForecastReportV04, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(FundDetailedConfirmedCashForecastReportV04 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(FundDetailedConfirmedCashForecastReportV04 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundDetailedConfirmedCashForecastReportV04";
				definition = "Scope\r\nA report provider, such as a transfer agent, sends the FundDetailedConfirmedCashForecastReport message to the report user, such as an investment manager or pricing agent, to report the confirmed cash incomings and outgoings, sorted by country, institution name or other criteria defined by the user of one or more share classes of an investment fund on one or more trade dates.\r\nThe cash movements may result from, for example, redemption, subscription, switch transactions or reinvestment of dividends.\r\nUsage\r\nThe FundDetailedConfirmedCashForecastReport is used to provide definitive cash movements, that is, it is sent after the cut-off time and/or the price valuation of the fund. \r\nIf the price is not yet definitive, then the FundDetailedEstimatedCashForecastReport message must be used.\r\nThe message structure allows for the following uses:\r\n-\tto provide cash in and cash out amounts for a fund/sub fund and one or more share classes (a FundOrSubFundDetails sequence and one or FundCashForecastDetails sequences are used),\r\n-\tto provide cash in and cash out amounts for one or more share classes (one or more FundCashForecastDetails sequences are used).\r\nIf the report is to provide cash in and cash out for a fund/sub fund only and not for one or more share classes, then the FundConfirmedCashForecastReport message must be used.\r\nThe FundDetailedConfirmedCashForecastReport message is used to report cash movements in or out of a fund, organised by party, such as fund management company, country, currency or by some other criteria defined by the report provider. If the report is used to given the cash-in and cash-out for a party, then additional criteria, such as currency and country, can be specified.\r\nIn addition, the underlying transaction type for the cash-in or cash-out movement can be specified, as well as information about the cash movement's underlying orders, such as commission and charges.";
				rootElement = "Document";
				xmlTag = "FndDtldConfdCshFcstRpt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmMessageIdentification,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmPoolReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmPreviousReference,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmRelatedReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmMessagePagination,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmFundOrSubFundDetails, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmFundCashForecastDetails,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmConsolidatedNetCashForecast, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "043";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundDetailedConfirmedCashForecastReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public FundDetailedConfirmedCashForecastReportV04 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public FundDetailedConfirmedCashForecastReportV04 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public FundDetailedConfirmedCashForecastReportV04 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public FundDetailedConfirmedCashForecastReportV04 setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public FundDetailedConfirmedCashForecastReportV04 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public Optional<Fund4> getFundOrSubFundDetails() {
		return fundOrSubFundDetails == null ? Optional.empty() : Optional.of(fundOrSubFundDetails);
	}

	public FundDetailedConfirmedCashForecastReportV04 setFundOrSubFundDetails(Fund4 fundOrSubFundDetails) {
		this.fundOrSubFundDetails = fundOrSubFundDetails;
		return this;
	}

	public List<FundCashForecast6> getFundCashForecastDetails() {
		return fundCashForecastDetails == null ? fundCashForecastDetails = new ArrayList<>() : fundCashForecastDetails;
	}

	public FundDetailedConfirmedCashForecastReportV04 setFundCashForecastDetails(List<FundCashForecast6> fundCashForecastDetails) {
		this.fundCashForecastDetails = Objects.requireNonNull(fundCashForecastDetails);
		return this;
	}

	public Optional<NetCashForecast3> getConsolidatedNetCashForecast() {
		return consolidatedNetCashForecast == null ? Optional.empty() : Optional.of(consolidatedNetCashForecast);
	}

	public FundDetailedConfirmedCashForecastReportV04 setConsolidatedNetCashForecast(NetCashForecast3 consolidatedNetCashForecast) {
		this.consolidatedNetCashForecast = consolidatedNetCashForecast;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public FundDetailedConfirmedCashForecastReportV04 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.043.001.04")
	static public class Document {
		@XmlElement(name = "FndDtldConfdCshFcstRpt", required = true)
		public FundDetailedConfirmedCashForecastReportV04 messageBody;
	}
}