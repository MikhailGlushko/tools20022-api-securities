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
import com.tools20022.repository.area.colr.*;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification100Choice;
import com.tools20022.repository.codeset.ExposureType5Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information like the identification of the party or parties
 * associated with the collateral agreement, the exposure type and the valuation
 * date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmPartyA
 * Obligation4.mmPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmServicingPartyA
 * Obligation4.mmServicingPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmPartyB
 * Obligation4.mmPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmServicingPartyB
 * Obligation4.mmServicingPartyB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Obligation4#mmCollateralAccountIdentification
 * Obligation4.mmCollateralAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmExposureType
 * Obligation4.mmExposureType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmValuationDate
 * Obligation4.mmValuationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
 * CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmObligation
 * MarginCallRequestV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmObligation
 * InterestPaymentResponseV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallDisputeNotificationV04#mmObligation
 * MarginCallDisputeNotificationV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmObligation
 * CollateralSubstitutionResponseV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmObligation
 * MarginCallResponseV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV04#mmObligation
 * InterestPaymentStatementV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#mmObligation
 * CollateralManagementCancellationRequestV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV04#mmObligation
 * CollateralSubstitutionConfirmationV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmObligation
 * InterestPaymentRequestV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#mmObligation
 * CollateralManagementCancellationStatusV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmObligation
 * CollateralSubstitutionRequestV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmObligation
 * CollateralAndExposureReportV03.mmObligation}</li>
 * </ul>
 * </li>
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
 * "Obligation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Obligation5 Obligation5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Obligation4", propOrder = {"partyA", "servicingPartyA", "partyB", "servicingPartyB", "collateralAccountIdentification", "exposureType", "valuationDate"})
public class Obligation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification100Choice partyA;
	/**
	 * Defines one of the entities associated with the collateral agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines one of the entities associated with the collateral agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmPartyA
	 * Obligation5.mmPartyA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyA = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Obligation4.mmObject();
			isDerived = false;
			xmlTag = "PtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyA";
			definition = "Defines one of the entities associated with the collateral agreement.";
			nextVersions_lazy = () -> Arrays.asList(Obligation5.mmPartyA);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
		}
	};
	protected PartyIdentification100Choice servicingPartyA;
	/**
	 * Specifies the party that is acting on behalf of party A and that offers
	 * collateral management services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcgPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServicingPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party that is acting on behalf of party A and that offers collateral management services."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#mmServicingPartyA
	 * Obligation5.mmServicingPartyA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServicingPartyA = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Obligation4.mmObject();
			isDerived = false;
			xmlTag = "SvcgPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyA";
			definition = "Specifies the party that is acting on behalf of party A and that offers collateral management services.";
			nextVersions_lazy = () -> Arrays.asList(Obligation5.mmServicingPartyA);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
		}
	};
	protected PartyIdentification100Choice partyB;
	/**
	 * Defines the other entity associated with the collateral agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the other entity associated with the collateral agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmPartyB
	 * Obligation5.mmPartyB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyB = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Obligation4.mmObject();
			isDerived = false;
			xmlTag = "PtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyB";
			definition = "Defines the other entity associated with the collateral agreement.";
			nextVersions_lazy = () -> Arrays.asList(Obligation5.mmPartyB);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
		}
	};
	protected PartyIdentification100Choice servicingPartyB;
	/**
	 * Specifies the party that is acting on behalf of party B and that offers
	 * collateral management services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
	 * PartyIdentification100Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcgPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServicingPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party that is acting on behalf of party B and that offers collateral management services."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#mmServicingPartyB
	 * Obligation5.mmServicingPartyB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServicingPartyB = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Obligation4.mmObject();
			isDerived = false;
			xmlTag = "SvcgPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicingPartyB";
			definition = "Specifies the party that is acting on behalf of party B and that offers collateral management services.";
			nextVersions_lazy = () -> Arrays.asList(Obligation5.mmServicingPartyB);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification100Choice.mmObject();
		}
	};
	protected CollateralAccount2 collateralAccountIdentification;
	/**
	 * Provides additional information on the collateral account of the party
	 * delivering/receiving the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount2
	 * CollateralAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the collateral account of the party delivering/receiving the collateral."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#mmCollateralAccountIdentification
	 * Obligation5.mmCollateralAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAccount;
			componentContext_lazy = () -> Obligation4.mmObject();
			isDerived = false;
			xmlTag = "CollAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccountIdentification";
			definition = "Provides additional information on the collateral account of the party delivering/receiving the collateral.";
			nextVersions_lazy = () -> Arrays.asList(Obligation5.mmCollateralAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CollateralAccount2.mmObject();
		}
	};
	protected ExposureType5Code exposureType;
	/**
	 * Specifies the underlying business area or type of trade causing the
	 * collateral movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType5Code
	 * ExposureType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area or type of trade causing the collateral movement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmExposureType
	 * Obligation5.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExposureType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> Obligation4.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area or type of trade causing the collateral movement.";
			nextVersions_lazy = () -> Arrays.asList(Obligation5.mmExposureType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExposureType5Code.mmObject();
		}
	};
	protected DateAndDateTimeChoice valuationDate;
	/**
	 * Indicates the close of business date on which the initiating party is
	 * valuing the margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarginCallValuationDate
	 * MarginCall.mmMarginCallValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Obligation4 Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the close of business date on which the initiating party is valuing the margin call."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#mmValuationDate
	 * Obligation5.mmValuationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarginCallValuationDate;
			componentContext_lazy = () -> Obligation4.mmObject();
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Indicates the close of business date on which the initiating party is valuing the margin call.";
			nextVersions_lazy = () -> Arrays.asList(Obligation5.mmValuationDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Obligation4.mmPartyA, Obligation4.mmServicingPartyA, Obligation4.mmPartyB, Obligation4.mmServicingPartyB, Obligation4.mmCollateralAccountIdentification, Obligation4.mmExposureType,
						Obligation4.mmValuationDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallRequestV04.mmObligation, InterestPaymentResponseV04.mmObligation, MarginCallDisputeNotificationV04.mmObligation, CollateralSubstitutionResponseV04.mmObligation,
						MarginCallResponseV04.mmObligation, InterestPaymentStatementV04.mmObligation, CollateralManagementCancellationRequestV04.mmObligation, CollateralSubstitutionConfirmationV04.mmObligation,
						InterestPaymentRequestV04.mmObligation, CollateralManagementCancellationStatusV04.mmObligation, CollateralSubstitutionRequestV04.mmObligation, CollateralAndExposureReportV03.mmObligation);
				trace_lazy = () -> CollateralAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Obligation4";
				definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
				nextVersions_lazy = () -> Arrays.asList(Obligation5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtyA", required = true)
	public PartyIdentification100Choice getPartyA() {
		return partyA;
	}

	public void setPartyA(PartyIdentification100Choice partyA) {
		this.partyA = partyA;
	}

	@XmlElement(name = "SvcgPtyA")
	public PartyIdentification100Choice getServicingPartyA() {
		return servicingPartyA;
	}

	public void setServicingPartyA(PartyIdentification100Choice servicingPartyA) {
		this.servicingPartyA = servicingPartyA;
	}

	@XmlElement(name = "PtyB", required = true)
	public PartyIdentification100Choice getPartyB() {
		return partyB;
	}

	public void setPartyB(PartyIdentification100Choice partyB) {
		this.partyB = partyB;
	}

	@XmlElement(name = "SvcgPtyB")
	public PartyIdentification100Choice getServicingPartyB() {
		return servicingPartyB;
	}

	public void setServicingPartyB(PartyIdentification100Choice servicingPartyB) {
		this.servicingPartyB = servicingPartyB;
	}

	@XmlElement(name = "CollAcctId")
	public CollateralAccount2 getCollateralAccountIdentification() {
		return collateralAccountIdentification;
	}

	public void setCollateralAccountIdentification(com.tools20022.repository.msg.CollateralAccount2 collateralAccountIdentification) {
		this.collateralAccountIdentification = collateralAccountIdentification;
	}

	@XmlElement(name = "XpsrTp")
	public ExposureType5Code getExposureType() {
		return exposureType;
	}

	public void setExposureType(ExposureType5Code exposureType) {
		this.exposureType = exposureType;
	}

	@XmlElement(name = "ValtnDt", required = true)
	public DateAndDateTimeChoice getValuationDate() {
		return valuationDate;
	}

	public void setValuationDate(DateAndDateTimeChoice valuationDate) {
		this.valuationDate = valuationDate;
	}
}