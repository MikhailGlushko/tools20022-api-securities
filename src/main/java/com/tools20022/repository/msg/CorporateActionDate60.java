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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat43Choice;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionDeadline;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies corporate action date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmResponseDeadline
 * CorporateActionDate60.mmResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmSubscriptionCostDebitDate
 * CorporateActionDate60.mmSubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmMarketDeadline
 * CorporateActionDate60.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmExpiryDate
 * CorporateActionDate60.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmCoverExpirationDate
 * CorporateActionDate60.mmCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmProtectDate
 * CorporateActionDate60.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmTradingDate
 * CorporateActionDate60.mmTradingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDate60"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action date."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDate60", propOrder = {"responseDeadline", "subscriptionCostDebitDate", "marketDeadline", "expiryDate", "coverExpirationDate", "protectDate", "tradingDate"})
public class CorporateActionDate60 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RspnDdln")
	protected DateFormat43Choice responseDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat43Choice
	 * DateFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmResponseDeadline
	 * CorporateActionDeadline.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60
	 * CorporateActionDate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::RDDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>> mmResponseDeadline = new MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmResponseDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate60.mmObject();
			isDerived = false;
			xmlTag = "RspnDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RDDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			definition = "Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat43Choice.mmObject();
		}

		@Override
		public Optional<DateFormat43Choice> getValue(CorporateActionDate60 obj) {
			return obj.getResponseDeadline();
		}

		@Override
		public void setValue(CorporateActionDate60 obj, Optional<DateFormat43Choice> value) {
			obj.setResponseDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptCostDbtDt")
	protected DateFormat43Choice subscriptionCostDebitDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat43Choice
	 * DateFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmSubscriptionCostDebitDate
	 * BiddingConditions.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60
	 * CorporateActionDate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptCostDbtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SUBS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionCostDebitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time by which cash must be in place in order to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>> mmSubscriptionCostDebitDate = new MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmSubscriptionCostDebitDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate60.mmObject();
			isDerived = false;
			xmlTag = "SbcptCostDbtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SUBS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date/time by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat43Choice.mmObject();
		}

		@Override
		public Optional<DateFormat43Choice> getValue(CorporateActionDate60 obj) {
			return obj.getSubscriptionCostDebitDate();
		}

		@Override
		public void setValue(CorporateActionDate60 obj, Optional<DateFormat43Choice> value) {
			obj.setSubscriptionCostDebitDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MktDdln")
	protected DateFormat43Choice marketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat43Choice
	 * DateFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60
	 * CorporateActionDate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::MKDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>> mmMarketDeadline = new MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate60.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::MKDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Issuer or issuer's agent deadline to respond, with an instruction, to an outstanding offer or privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat43Choice.mmObject();
		}

		@Override
		public Optional<DateFormat43Choice> getValue(CorporateActionDate60 obj) {
			return obj.getMarketDeadline();
		}

		@Override
		public void setValue(CorporateActionDate60 obj, Optional<DateFormat43Choice> value) {
			obj.setMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
	protected DateFormat43Choice expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat43Choice
	 * DateFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmExpiryDate
	 * CorporateActionDeadline.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60
	 * CorporateActionDate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EXPI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an order expires or on which a privilege or offer terminates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>> mmExpiryDate = new MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate60.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EXPI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date/time at which an order expires or on which a privilege or offer terminates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat43Choice.mmObject();
		}

		@Override
		public Optional<DateFormat43Choice> getValue(CorporateActionDate60 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(CorporateActionDate60 obj, Optional<DateFormat43Choice> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CoverXprtnDt")
	protected DateFormat43Choice coverExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat43Choice
	 * DateFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCoverExpirationDate
	 * CorporateActionDeadline.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60
	 * CorporateActionDate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::CVPR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day a holder can deliver the securities that it had elected on and/or previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>> mmCoverExpirationDate = new MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmCoverExpirationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate60.mmObject();
			isDerived = false;
			xmlTag = "CoverXprtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::CVPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat43Choice.mmObject();
		}

		@Override
		public Optional<DateFormat43Choice> getValue(CorporateActionDate60 obj) {
			return obj.getCoverExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDate60 obj, Optional<DateFormat43Choice> value) {
			obj.setCoverExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctDt")
	protected DateFormat43Choice protectDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat43Choice
	 * DateFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmProtectDate
	 * CorporateActionDeadline.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60
	 * CorporateActionDate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PODT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>> mmProtectDate = new MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmProtectDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate60.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PODT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Last date/time a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat43Choice.mmObject();
		}

		@Override
		public Optional<DateFormat43Choice> getValue(CorporateActionDate60 obj) {
			return obj.getProtectDate();
		}

		@Override
		public void setValue(CorporateActionDate60 obj, Optional<DateFormat43Choice> value) {
			obj.setProtectDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgDt")
	protected DateFormat43Choice tradingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat43Choice
	 * DateFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingDate
	 * CorporateActionEvent.mmTradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60
	 * CorporateActionDate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the deal (rights) was agreed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>> mmTradingDate = new MMMessageAssociationEnd<CorporateActionDate60, Optional<DateFormat43Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTradingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate60.mmObject();
			isDerived = false;
			xmlTag = "TradgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat43Choice.mmObject();
		}

		@Override
		public Optional<DateFormat43Choice> getValue(CorporateActionDate60 obj) {
			return obj.getTradingDate();
		}

		@Override
		public void setValue(CorporateActionDate60 obj, Optional<DateFormat43Choice> value) {
			obj.setTradingDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate60.mmResponseDeadline, com.tools20022.repository.msg.CorporateActionDate60.mmSubscriptionCostDebitDate,
						com.tools20022.repository.msg.CorporateActionDate60.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate60.mmExpiryDate, com.tools20022.repository.msg.CorporateActionDate60.mmCoverExpirationDate,
						com.tools20022.repository.msg.CorporateActionDate60.mmProtectDate, com.tools20022.repository.msg.CorporateActionDate60.mmTradingDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate60";
				definition = "Specifies corporate action date.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateFormat43Choice> getResponseDeadline() {
		return responseDeadline == null ? Optional.empty() : Optional.of(responseDeadline);
	}

	public CorporateActionDate60 setResponseDeadline(DateFormat43Choice responseDeadline) {
		this.responseDeadline = responseDeadline;
		return this;
	}

	public Optional<DateFormat43Choice> getSubscriptionCostDebitDate() {
		return subscriptionCostDebitDate == null ? Optional.empty() : Optional.of(subscriptionCostDebitDate);
	}

	public CorporateActionDate60 setSubscriptionCostDebitDate(DateFormat43Choice subscriptionCostDebitDate) {
		this.subscriptionCostDebitDate = subscriptionCostDebitDate;
		return this;
	}

	public Optional<DateFormat43Choice> getMarketDeadline() {
		return marketDeadline == null ? Optional.empty() : Optional.of(marketDeadline);
	}

	public CorporateActionDate60 setMarketDeadline(DateFormat43Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
		return this;
	}

	public Optional<DateFormat43Choice> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public CorporateActionDate60 setExpiryDate(DateFormat43Choice expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<DateFormat43Choice> getCoverExpirationDate() {
		return coverExpirationDate == null ? Optional.empty() : Optional.of(coverExpirationDate);
	}

	public CorporateActionDate60 setCoverExpirationDate(DateFormat43Choice coverExpirationDate) {
		this.coverExpirationDate = coverExpirationDate;
		return this;
	}

	public Optional<DateFormat43Choice> getProtectDate() {
		return protectDate == null ? Optional.empty() : Optional.of(protectDate);
	}

	public CorporateActionDate60 setProtectDate(DateFormat43Choice protectDate) {
		this.protectDate = protectDate;
		return this;
	}

	public Optional<DateFormat43Choice> getTradingDate() {
		return tradingDate == null ? Optional.empty() : Optional.of(tradingDate);
	}

	public CorporateActionDate60 setTradingDate(DateFormat43Choice tradingDate) {
		this.tradingDate = tradingDate;
		return this;
	}
}