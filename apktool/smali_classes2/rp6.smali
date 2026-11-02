.class public final Lrp6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf91;


# instance fields
.field public final X:Ls6;


# direct methods
.method public constructor <init>(Ls6;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrp6;->X:Ls6;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    invoke-static {p0}, Lhi5;->a0(Lf91;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lue3;->y(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, Lrp6;->X:Ls6;

    .line 10
    .line 11
    iget-object v1, p0, Ls6;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ls6;->f0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Ls6;->Y:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ls6;->i0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ls6;->B0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Ls6;->z0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Ls6;->y0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Ls6;->m0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Ls6;->n0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Ls6;->x0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Ls6;->k0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Ls6;->l0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Ls6;->j0:Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lrp6;->X:Ls6;

    .line 2
    .line 3
    iget-object v1, v0, Ls6;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 4
    .line 5
    new-instance v2, Lqp6;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Ls6;->f0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 15
    .line 16
    new-instance v2, Lqp6;

    .line 17
    .line 18
    const/4 v3, 0x5

    .line 19
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Ls6;->Y:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 26
    .line 27
    new-instance v2, Lqp6;

    .line 28
    .line 29
    const/4 v3, 0x6

    .line 30
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Ls6;->i0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 37
    .line 38
    new-instance v2, Lqp6;

    .line 39
    .line 40
    const/4 v3, 0x7

    .line 41
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v0, Ls6;->B0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 48
    .line 49
    new-instance v2, Lqp6;

    .line 50
    .line 51
    const/16 v3, 0x8

    .line 52
    .line 53
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, Ls6;->z0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 60
    .line 61
    new-instance v2, Lqp6;

    .line 62
    .line 63
    const/16 v3, 0x9

    .line 64
    .line 65
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v0, Ls6;->y0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 72
    .line 73
    new-instance v2, Lqp6;

    .line 74
    .line 75
    const/16 v3, 0xa

    .line 76
    .line 77
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, Ls6;->m0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 84
    .line 85
    new-instance v2, Lqp6;

    .line 86
    .line 87
    const/16 v3, 0xb

    .line 88
    .line 89
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, v0, Ls6;->n0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 96
    .line 97
    new-instance v2, Lqp6;

    .line 98
    .line 99
    const/16 v3, 0xc

    .line 100
    .line 101
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v0, Ls6;->x0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 108
    .line 109
    new-instance v2, Lqp6;

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, v0, Ls6;->k0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 119
    .line 120
    new-instance v2, Lqp6;

    .line 121
    .line 122
    const/4 v3, 0x1

    .line 123
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 124
    .line 125
    .line 126
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 127
    .line 128
    .line 129
    iget-object v1, v0, Ls6;->l0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 130
    .line 131
    new-instance v2, Lqp6;

    .line 132
    .line 133
    const/4 v3, 0x2

    .line 134
    invoke-direct {v2, p0, v3}, Lqp6;-><init>(Lrp6;B)V

    .line 135
    .line 136
    .line 137
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, v0, Ls6;->j0:Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 141
    .line 142
    new-instance v1, Lqp6;

    .line 143
    .line 144
    const/4 v2, 0x3

    .line 145
    invoke-direct {v1, p0, v2}, Lqp6;-><init>(Lrp6;B)V

    .line 146
    .line 147
    .line 148
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Lrp6;->X:Ls6;

    .line 2
    .line 3
    return-object p0
.end method
