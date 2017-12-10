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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.CollateralMovement5Choice;
import com.tools20022.repository.choice.CollateralProposal5Choice;
import com.tools20022.repository.choice.CollateralProposalResponse3Choice;
import com.tools20022.repository.codeset.CollateralProposalResponseCode;
import com.tools20022.repository.codeset.ProposalTypeCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies collateral proposed to the counterparty.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralProposal" src="doc-files/CollateralProposal.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
 * CollateralProposal.mmProposedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmResponseType
 * CollateralProposal.mmResponseType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralProposal#mmType
 * CollateralProposal.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmRelatedManagementProcess
 * CollateralProposal.mmRelatedManagementProcess}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmRelatedCollateralProposal
 * CollateralMovement.mmRelatedCollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralProposal
 * CollateralManagement.mmCollateralProposal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal5#mmCollateralProposal
 * Proposal5.mmCollateralProposal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal5 Proposal5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice
 * CollateralProposalResponse3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3
 * CollateralProposalResponseType3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralResponse2
 * CollateralResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralProposal5Choice
 * CollateralProposal5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposalResponse3
 * CollateralProposalResponse3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement10
 * CollateralMovement10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralMovement5Choice
 * CollateralMovement5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposal6
 * CollateralProposal6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement11
 * CollateralMovement11}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralProposal"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies collateral proposed to the counterparty."</li>
 * </ul>
 */
public class CollateralProposal {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CollateralMovement> proposedCollateralMovement;
	/**
	 * Details the movement of collateral that is proposed to be delivered or
	 * returned by one of the collateral parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmRelatedCollateralProposal
	 * CollateralMovement.mmRelatedCollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice#mmCollateralProposal
	 * CollateralProposalResponse3Choice.mmCollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmResponse
	 * CollateralProposalResponseType3.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal5Choice#mmCollateralProposalDetails
	 * CollateralProposal5Choice.mmCollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement10#mmMovementDirection
	 * CollateralMovement10.mmMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice#mmCollateralMovementDirection
	 * CollateralMovement5Choice.mmCollateralMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice#mmReturn
	 * CollateralMovement5Choice.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement11#mmDeliver
	 * CollateralMovement11.mmDeliver}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement11#mmReturn
	 * CollateralMovement11.mmReturn}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details the movement of collateral that is proposed to be delivered or returned by one of the collateral parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProposedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralProposalResponse3Choice.mmCollateralProposal, CollateralProposalResponseType3.mmResponse, CollateralProposal5Choice.mmCollateralProposalDetails,
					CollateralMovement10.mmMovementDirection, CollateralMovement5Choice.mmCollateralMovementDirection, CollateralMovement5Choice.mmReturn, CollateralMovement11.mmDeliver, CollateralMovement11.mmReturn);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedCollateralMovement";
			definition = "Details the movement of collateral that is proposed to be delivered or returned by one of the collateral parties.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmRelatedCollateralProposal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
		}
	};
	protected CollateralProposalResponseCode responseType;
	/**
	 * Indicates whether the collateral proposal is an initial or a counter
	 * proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponseCode
	 * CollateralProposalResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmType
	 * CollateralProposalResponseType3.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the collateral proposal is an initial or a counter proposal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResponseType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralProposalResponseType3.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Indicates whether the collateral proposal is an initial or a counter proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralProposalResponseCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposal.class.getMethod("getResponseType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProposalTypeCode type;
	/**
	 * Indicates whether this is an initial or counter proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProposalTypeCode
	 * ProposalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal5#mmCollateralProposalType
	 * Proposal5.mmCollateralProposalType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether this is an initial or counter proposal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Proposal5.mmCollateralProposalType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether this is an initial or counter proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProposalTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposal.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralProposal
	 * CollateralManagement.mmCollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmCollateralProposal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralProposal";
				definition = "Specifies collateral proposed to the counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralMovement.mmRelatedCollateralProposal, com.tools20022.repository.entity.CollateralManagement.mmCollateralProposal);
				derivationElement_lazy = () -> Arrays.asList(Proposal5.mmCollateralProposal);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralProposal.mmProposedCollateralMovement, com.tools20022.repository.entity.CollateralProposal.mmResponseType,
						com.tools20022.repository.entity.CollateralProposal.mmType, com.tools20022.repository.entity.CollateralProposal.mmRelatedManagementProcess);
				derivationComponent_lazy = () -> Arrays.asList(Proposal5.mmObject(), CollateralProposalResponse3Choice.mmObject(), CollateralProposalResponseType3.mmObject(), CollateralResponse2.mmObject(),
						CollateralProposal5Choice.mmObject(), CollateralProposalResponse3.mmObject(), CollateralMovement10.mmObject(), CollateralMovement5Choice.mmObject(), CollateralProposal6.mmObject(), CollateralMovement11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralProposal.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CollateralMovement> getProposedCollateralMovement() {
		return proposedCollateralMovement;
	}

	public void setProposedCollateralMovement(List<com.tools20022.repository.entity.CollateralMovement> proposedCollateralMovement) {
		this.proposedCollateralMovement = proposedCollateralMovement;
	}

	public CollateralProposalResponseCode getResponseType() {
		return responseType;
	}

	public void setResponseType(CollateralProposalResponseCode responseType) {
		this.responseType = responseType;
	}

	public ProposalTypeCode getType() {
		return type;
	}

	public void setType(ProposalTypeCode type) {
		this.type = type;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return relatedManagementProcess;
	}

	public void setRelatedManagementProcess(com.tools20022.repository.entity.CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
	}
}