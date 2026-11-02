.class public final Ls;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf91;


# instance fields
.field public final X:Lt5;


# direct methods
.method public constructor <init>(Lt5;)V
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
    iput-object p1, p0, Ls;->X:Lt5;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ls;->X:Lt5;

    .line 5
    .line 6
    iget-object p0, p0, Lt5;->n0:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/ScrollView;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lpu;->s(Landroid/widget/ScrollView;Landroid/view/View;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

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
    iget-object p0, p0, Ls;->X:Lt5;

    .line 10
    .line 11
    iget-object v1, p0, Lt5;->m0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lt5;->h0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lt5;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lt5;->Z:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lt5;->Y:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lt5;->i0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lt5;->l0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lt5;->g0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lt5;->k0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lt5;->j0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Ls;->X:Lt5;

    .line 2
    .line 3
    iget-object v1, v0, Lt5;->m0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 6
    .line 7
    new-instance v2, Lr;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lt5;->h0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 19
    .line 20
    new-instance v2, Lr;

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Lt5;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 32
    .line 33
    new-instance v2, Lr;

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v0, Lt5;->Z:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 45
    .line 46
    new-instance v2, Lr;

    .line 47
    .line 48
    const/4 v3, 0x4

    .line 49
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v0, Lt5;->Y:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 58
    .line 59
    new-instance v2, Lr;

    .line 60
    .line 61
    const/4 v3, 0x5

    .line 62
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, Lt5;->i0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 71
    .line 72
    new-instance v2, Lr;

    .line 73
    .line 74
    const/4 v3, 0x6

    .line 75
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v0, Lt5;->l0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 84
    .line 85
    new-instance v2, Lr;

    .line 86
    .line 87
    const/4 v3, 0x7

    .line 88
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, Lt5;->g0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 97
    .line 98
    new-instance v2, Lr;

    .line 99
    .line 100
    const/16 v3, 0x8

    .line 101
    .line 102
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, v0, Lt5;->k0:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 111
    .line 112
    new-instance v2, Lr;

    .line 113
    .line 114
    const/16 v3, 0x9

    .line 115
    .line 116
    invoke-direct {v2, p0, v3}, Lr;-><init>(Ls;B)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, v0, Lt5;->j0:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 125
    .line 126
    new-instance v1, Lr;

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-direct {v1, p0, v2}, Lr;-><init>(Ls;B)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Ls;->X:Lt5;

    .line 2
    .line 3
    return-object p0
.end method
