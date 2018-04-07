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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.Fund2;
import com.tools20022.repository.msg.FundCashForecast7;
import com.tools20022.repository.msg.NetCashForecast3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a cash forecast report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#mmFundOrSubFundDetails
 * FundConfirmedCashForecastReport3.mmFundOrSubFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#mmFundCashForecastDetails
 * FundConfirmedCashForecastReport3.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#mmConsolidatedNetCashForecast
 * FundConfirmedCashForecastReport3.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#mmExtension
 * FundConfirmedCashForecastReport3.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmCashForecastReportToBeCancelled
 * FundConfirmedCashForecastReportCancellationV03.
 * mmCashForecastReportToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDate1Rule#forFundConfirmedCashForecastReport3
 * ConstraintTradeDate1Rule.forFundConfirmedCashForecastReport3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousTradeDate1Rule#forFundConfirmedCashForecastReport3
 * ConstraintPreviousTradeDate1Rule.forFundConfirmedCashForecastReport3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDate2Rule#forFundConfirmedCashForecastReport3
 * ConstraintTradeDate2Rule.forFundConfirmedCashForecastReport3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintConsolidatedNetCashRule#forFundConfirmedCashForecastReport3
 * ConstraintConsolidatedNetCashRule.forFundConfirmedCashForecastReport3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFundOrSubFundAndShareClassGuideline#forFundConfirmedCashForecastReport3
 * ConstraintFundOrSubFundAndShareClassGuideline.
 * forFundConfirmedCashForecastReport3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundConfirmedCashForecastReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a cash forecast report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundConfirmedCashForecastReport3", propOrder = {"fundOrSubFundDetails", "fundCashForecastDetails", "consolidatedNetCashForecast", "extension"})
public class FundConfirmedCashForecastReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FndOrSubFndDtls")
	protected List<Fund2> fundOrSubFundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Fund2 Fund2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3
	 * FundConfirmedCashForecastReport3}</li>
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
	public static final MMMessageAssociationEnd<FundConfirmedCashForecastReport3, List<Fund2>> mmFundOrSubFundDetails = new MMMessageAssociationEnd<FundConfirmedCashForecastReport3, List<Fund2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundConfirmedCashForecastReport3.mmObject();
			isDerived = false;
			xmlTag = "FndOrSubFndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOrSubFundDetails";
			definition = "Information about the fund/sub fund when the report either specifies cash flow for the fund/sub fund or for a share class of the fund/sub fund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Fund2.mmObject();
		}

		@Override
		public List<Fund2> getValue(FundConfirmedCashForecastReport3 obj) {
			return obj.getFundOrSubFundDetails();
		}

		@Override
		public void setValue(FundConfirmedCashForecastReport3 obj, List<Fund2> value) {
			obj.setFundOrSubFundDetails(value);
		}
	};
	@XmlElement(name = "FndCshFcstDtls")
	protected List<FundCashForecast7> fundCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3
	 * FundConfirmedCashForecastReport3}</li>
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
	 * "Information related to the cash-in and cash-out flows for a specific trade date as a result of investment fund transactions, for example, subscriptions, redemptions or switches to/from a specified investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundConfirmedCashForecastReport3, List<FundCashForecast7>> mmFundCashForecastDetails = new MMMessageAssociationEnd<FundConfirmedCashForecastReport3, List<FundCashForecast7>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FundConfirmedCashForecastReport3.mmObject();
			isDerived = false;
			xmlTag = "FndCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashForecastDetails";
			definition = "Information related to the cash-in and cash-out flows for a specific trade date as a result of investment fund transactions, for example, subscriptions, redemptions or switches to/from a specified investment fund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundCashForecast7.mmObject();
		}

		@Override
		public List<FundCashForecast7> getValue(FundConfirmedCashForecastReport3 obj) {
			return obj.getFundCashForecastDetails();
		}

		@Override
		public void setValue(FundConfirmedCashForecastReport3 obj, List<FundCashForecast7> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast3
	 * NetCashForecast3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3
	 * FundConfirmedCashForecastReport3}</li>
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
	 * "Estimated net cash as a result of the cash-in and cash-out flows."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundConfirmedCashForecastReport3, Optional<NetCashForecast3>> mmConsolidatedNetCashForecast = new MMMessageAssociationEnd<FundConfirmedCashForecastReport3, Optional<NetCashForecast3>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FundConfirmedCashForecastReport3.mmObject();
			isDerived = false;
			xmlTag = "CnsltdNetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedNetCashForecast";
			definition = "Estimated net cash as a result of the cash-in and cash-out flows.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast3.mmObject();
		}

		@Override
		public Optional<NetCashForecast3> getValue(FundConfirmedCashForecastReport3 obj) {
			return obj.getConsolidatedNetCashForecast();
		}

		@Override
		public void setValue(FundConfirmedCashForecastReport3 obj, Optional<NetCashForecast3> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3
	 * FundConfirmedCashForecastReport3}</li>
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
	public static final MMMessageAssociationEnd<FundConfirmedCashForecastReport3, List<Extension1>> mmExtension = new MMMessageAssociationEnd<FundConfirmedCashForecastReport3, List<Extension1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundConfirmedCashForecastReport3.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(FundConfirmedCashForecastReport3 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(FundConfirmedCashForecastReport3 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundConfirmedCashForecastReport3.mmFundOrSubFundDetails, com.tools20022.repository.msg.FundConfirmedCashForecastReport3.mmFundCashForecastDetails,
						com.tools20022.repository.msg.FundConfirmedCashForecastReport3.mmConsolidatedNetCashForecast, com.tools20022.repository.msg.FundConfirmedCashForecastReport3.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV03.mmCashForecastReportToBeCancelled);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDate1Rule.forFundConfirmedCashForecastReport3,
						com.tools20022.repository.constraints.ConstraintPreviousTradeDate1Rule.forFundConfirmedCashForecastReport3, com.tools20022.repository.constraints.ConstraintTradeDate2Rule.forFundConfirmedCashForecastReport3,
						com.tools20022.repository.constraints.ConstraintConsolidatedNetCashRule.forFundConfirmedCashForecastReport3,
						com.tools20022.repository.constraints.ConstraintFundOrSubFundAndShareClassGuideline.forFundConfirmedCashForecastReport3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundConfirmedCashForecastReport3";
				definition = "Information about a cash forecast report.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Fund2> getFundOrSubFundDetails() {
		return fundOrSubFundDetails == null ? fundOrSubFundDetails = new ArrayList<>() : fundOrSubFundDetails;
	}

	public FundConfirmedCashForecastReport3 setFundOrSubFundDetails(List<Fund2> fundOrSubFundDetails) {
		this.fundOrSubFundDetails = Objects.requireNonNull(fundOrSubFundDetails);
		return this;
	}

	public List<FundCashForecast7> getFundCashForecastDetails() {
		return fundCashForecastDetails == null ? fundCashForecastDetails = new ArrayList<>() : fundCashForecastDetails;
	}

	public FundConfirmedCashForecastReport3 setFundCashForecastDetails(List<FundCashForecast7> fundCashForecastDetails) {
		this.fundCashForecastDetails = Objects.requireNonNull(fundCashForecastDetails);
		return this;
	}

	public Optional<NetCashForecast3> getConsolidatedNetCashForecast() {
		return consolidatedNetCashForecast == null ? Optional.empty() : Optional.of(consolidatedNetCashForecast);
	}

	public FundConfirmedCashForecastReport3 setConsolidatedNetCashForecast(NetCashForecast3 consolidatedNetCashForecast) {
		this.consolidatedNetCashForecast = consolidatedNetCashForecast;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public FundConfirmedCashForecastReport3 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}