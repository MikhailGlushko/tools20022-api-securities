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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat31Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies security date details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate12#mmPaymentDate
 * SecurityDate12.mmPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate12#mmAvailableDate
 * SecurityDate12.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmDividendRankingDate
 * SecurityDate12.mmDividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmEarliestPaymentDate
 * SecurityDate12.mmEarliestPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate12#mmPariPassuDate
 * SecurityDate12.mmPariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmLastTradingDate
 * SecurityDate12.mmLastTradingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityDate12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies security date details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityDate12", propOrder = {"paymentDate", "availableDate", "dividendRankingDate", "earliestPaymentDate", "pariPassuDate", "lastTradingDate"})
public class SecurityDate12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat31Choice paymentDate;
	/**
	 * Date/time at which the movement is due to take place (cash and/or
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12 SecurityDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> SecurityDate12.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice availableDate;
	/**
	 * Date/time at which securities become available for trading, for example
	 * first dealing date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
	 * Security.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12 SecurityDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which securities become available for trading, for example first dealing date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAvailableDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmAvailableDate;
			componentContext_lazy = () -> SecurityDate12.mmObject();
			isDerived = false;
			xmlTag = "AvlblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDate";
			definition = "Date/time at which securities become available for trading, for example first dealing date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice dividendRankingDate;
	/**
	 * Date/time at which a security will be entitled to a dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendRankingDate
	 * Dividend.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12 SecurityDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddRnkgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRankingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a security will be entitled to a dividend."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDividendRankingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDividendRankingDate;
			componentContext_lazy = () -> SecurityDate12.mmObject();
			isDerived = false;
			xmlTag = "DvddRnkgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendRankingDate";
			definition = "Date/time at which a security will be entitled to a dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice earliestPaymentDate;
	/**
	 * Date/time at which a payment can be made, for example, if payment date is
	 * a non-business day or to indicate the first payment date of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
	 * ProceedsDefinition.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12 SecurityDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarliestPaymentDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmEarliestPaymentDate;
			componentContext_lazy = () -> SecurityDate12.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/time at which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice pariPassuDate;
	/**
	 * Date/time at which security will assimilate, become fungible, or have the
	 * same rights to dividends as the parent issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPariPassuDate
	 * CorporateActionEvent.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12 SecurityDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrpssDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPariPassuDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmPariPassuDate;
			componentContext_lazy = () -> SecurityDate12.mmObject();
			isDerived = false;
			xmlTag = "PrpssDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassuDate";
			definition = "Date/time at which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice lastTradingDate;
	/**
	 * Date/time at which the securities to be reorganised will cease to be
	 * tradeable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12 SecurityDate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastTradgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the securities to be reorganised will cease to be tradeable. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastTradingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityDate12.mmObject();
			isDerived = false;
			xmlTag = "LastTradgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTradingDate";
			definition = "Date/time at which the securities to be reorganised will cease to be tradeable. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat31Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityDate12.mmPaymentDate, SecurityDate12.mmAvailableDate, SecurityDate12.mmDividendRankingDate, SecurityDate12.mmEarliestPaymentDate, SecurityDate12.mmPariPassuDate,
						SecurityDate12.mmLastTradingDate);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityDate12";
				definition = "Specifies security date details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtDt", required = true)
	public DateFormat31Choice getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(DateFormat31Choice paymentDate) {
		this.paymentDate = paymentDate;
	}

	@XmlElement(name = "AvlblDt")
	public DateFormat31Choice getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(DateFormat31Choice availableDate) {
		this.availableDate = availableDate;
	}

	@XmlElement(name = "DvddRnkgDt")
	public DateFormat31Choice getDividendRankingDate() {
		return dividendRankingDate;
	}

	public void setDividendRankingDate(DateFormat31Choice dividendRankingDate) {
		this.dividendRankingDate = dividendRankingDate;
	}

	@XmlElement(name = "EarlstPmtDt")
	public DateFormat31Choice getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(DateFormat31Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}

	@XmlElement(name = "PrpssDt")
	public DateFormat31Choice getPariPassuDate() {
		return pariPassuDate;
	}

	public void setPariPassuDate(DateFormat31Choice pariPassuDate) {
		this.pariPassuDate = pariPassuDate;
	}

	@XmlElement(name = "LastTradgDt")
	public DateFormat31Choice getLastTradingDate() {
		return lastTradingDate;
	}

	public void setLastTradingDate(DateFormat31Choice lastTradingDate) {
		this.lastTradingDate = lastTradingDate;
	}
}