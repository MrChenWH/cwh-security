package com.github.cwh.common.vo;

import lombok.Data;
import org.assertj.core.util.Lists;

import java.util.List;

@Data
public class TreeNode {
    protected int id;
    protected int parentId;

    List<TreeNode> children = Lists.newArrayList();

    public void add(TreeNode node) {
        children.add(node);
    }
}
