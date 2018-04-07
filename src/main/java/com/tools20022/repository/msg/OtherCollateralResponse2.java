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
import com.tools20022.repository.codeset.RejectionReasonV021Code;
import com.tools20022.repository.codeset.Status4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides more details on the response such as the response type, the
 * collateral identification, and optionally further details in case of
 * rejection.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#mmResponseType
 * OtherCollateralResponse2.mmResponseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#mmCollateralIdentification
 * OtherCollateralResponse2.mmCollateralIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#mmAssetNumber
 * OtherCollateralResponse2.mmAssetNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#mmRejectionReason
 * OtherCollateralResponse2.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#mmRejectionInformation
 * OtherCollateralResponse2.mmRejectionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintProposalRejectionRule#forOtherCollateralResponse2
 * ConstraintProposalRejectionRule.forOtherCollateralResponse2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherCollateralResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides more details on the response such as the response type, the collateral identification, and optionally further details in case of rejection."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherCollateralResponse2", propOrder = {"responseType", "collateralIdentification", "assetNumber", "rejectionReason", "rejectionInformation"})
public class OtherCollateralResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RspnTp", required = true)
	protected Status4Code responseType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status4Code
	 * Status4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmResponseStatus
	 * CollateralStatus.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2
	 * OtherCollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the collateral proposal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateralResponse2, Status4Code> mmResponseType = new MMMessageAttribute<OtherCollateralResponse2, Status4Code>() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmResponseStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "RspnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Specifies the status of the collateral proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status4Code.mmObject();
		}

		@Override
		public Status4Code getValue(OtherCollateralResponse2 obj) {
			return obj.getResponseType();
		}

		@Override
		public void setValue(OtherCollateralResponse2 obj, Status4Code value) {
			obj.setResponseType(value);
		}
	};
	@XmlElement(name = "CollId")
	protected Max35Text collateralIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2
	 * OtherCollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the proposed collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateralResponse2, Optional<Max35Text>> mmCollateralIdentification = new MMMessageAttribute<OtherCollateralResponse2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "CollId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIdentification";
			definition = "Provides the identification of the proposed collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OtherCollateralResponse2 obj) {
			return obj.getCollateralIdentification();
		}

		@Override
		public void setValue(OtherCollateralResponse2 obj, Optional<Max35Text> value) {
			obj.setCollateralIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AsstNb")
	protected Max35Text assetNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2
	 * OtherCollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the register number of the collateral deposit assigned by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateralResponse2, Optional<Max35Text>> mmAssetNumber = new MMMessageAttribute<OtherCollateralResponse2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "AsstNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetNumber";
			definition = "Identifies the register number of the collateral deposit assigned by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OtherCollateralResponse2 obj) {
			return obj.getAssetNumber();
		}

		@Override
		public void setValue(OtherCollateralResponse2 obj, Optional<Max35Text> value) {
			obj.setAssetNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected RejectionReasonV021Code rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2
	 * OtherCollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/cancellation request has a rejected status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateralResponse2, Optional<RejectionReasonV021Code>> mmRejectionReason = new MMMessageAttribute<OtherCollateralResponse2, Optional<RejectionReasonV021Code>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RejectionReasonV021Code.mmObject();
		}

		@Override
		public Optional<RejectionReasonV021Code> getValue(OtherCollateralResponse2 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(OtherCollateralResponse2 obj, Optional<RejectionReasonV021Code> value) {
			obj.setRejectionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctnInf")
	protected Max35Text rejectionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2
	 * OtherCollateralResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information regarding why the collateral proposal has a rejected status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateralResponse2, Optional<Max35Text>> mmRejectionInformation = new MMMessageAttribute<OtherCollateralResponse2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateralResponse2.mmObject();
			isDerived = false;
			xmlTag = "RjctnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionInformation";
			definition = "Additional information regarding why the collateral proposal has a rejected status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OtherCollateralResponse2 obj) {
			return obj.getRejectionInformation();
		}

		@Override
		public void setValue(OtherCollateralResponse2 obj, Optional<Max35Text> value) {
			obj.setRejectionInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateralResponse2.mmResponseType, com.tools20022.repository.msg.OtherCollateralResponse2.mmCollateralIdentification,
						com.tools20022.repository.msg.OtherCollateralResponse2.mmAssetNumber, com.tools20022.repository.msg.OtherCollateralResponse2.mmRejectionReason,
						com.tools20022.repository.msg.OtherCollateralResponse2.mmRejectionInformation);
				trace_lazy = () -> CollateralStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProposalRejectionRule.forOtherCollateralResponse2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherCollateralResponse2";
				definition = "Provides more details on the response such as the response type, the collateral identification, and optionally further details in case of rejection.";
			}
		});
		return mmObject_lazy.get();
	}

	public Status4Code getResponseType() {
		return responseType;
	}

	public OtherCollateralResponse2 setResponseType(Status4Code responseType) {
		this.responseType = Objects.requireNonNull(responseType);
		return this;
	}

	public Optional<Max35Text> getCollateralIdentification() {
		return collateralIdentification == null ? Optional.empty() : Optional.of(collateralIdentification);
	}

	public OtherCollateralResponse2 setCollateralIdentification(Max35Text collateralIdentification) {
		this.collateralIdentification = collateralIdentification;
		return this;
	}

	public Optional<Max35Text> getAssetNumber() {
		return assetNumber == null ? Optional.empty() : Optional.of(assetNumber);
	}

	public OtherCollateralResponse2 setAssetNumber(Max35Text assetNumber) {
		this.assetNumber = assetNumber;
		return this;
	}

	public Optional<RejectionReasonV021Code> getRejectionReason() {
		return rejectionReason == null ? Optional.empty() : Optional.of(rejectionReason);
	}

	public OtherCollateralResponse2 setRejectionReason(RejectionReasonV021Code rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	public Optional<Max35Text> getRejectionInformation() {
		return rejectionInformation == null ? Optional.empty() : Optional.of(rejectionInformation);
	}

	public OtherCollateralResponse2 setRejectionInformation(Max35Text rejectionInformation) {
		this.rejectionInformation = rejectionInformation;
		return this;
	}
}