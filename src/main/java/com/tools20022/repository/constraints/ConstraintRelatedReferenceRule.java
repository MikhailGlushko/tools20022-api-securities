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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.TransferCancellationStatusReportV06;
import com.tools20022.repository.area.sese.TransferInstructionStatusReportV06;

/**
 * If Reference/RelatedReference/MessageName is present, it must start with
 * sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.
 */
public class ConstraintRelatedReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06
	 * TransferInstructionStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV06> for_sese_TransferInstructionStatusReportV06 = new MMConstraint<TransferInstructionStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.";
			owner_lazy = () -> TransferInstructionStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV06 obj) throws Exception {
			check_sese_TransferInstructionStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06
	 * TransferCancellationStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV06> for_sese_TransferCancellationStatusReportV06 = new MMConstraint<TransferCancellationStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014.";
			owner_lazy = () -> TransferCancellationStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV06 obj) throws Exception {
			check_sese_TransferCancellationStatusReportV06(obj);
		}
	};

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.
	 */
	public static void check_sese_TransferInstructionStatusReportV06(TransferInstructionStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.002, sese.006, sese.009 or sese.014.
	 */
	public static void check_sese_TransferCancellationStatusReportV06(TransferCancellationStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}