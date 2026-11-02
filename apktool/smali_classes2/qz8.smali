.class public final Lqz8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf91;


# instance fields
.field public final X:Lw6;


# direct methods
.method public constructor <init>(Lw6;)V
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
    iput-object p1, p0, Lqz8;->X:Lw6;

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
    iget-object p0, p0, Lqz8;->X:Lw6;

    .line 5
    .line 6
    iget-object p0, p0, Lw6;->v0:Landroid/widget/ScrollView;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lpu;->s(Landroid/widget/ScrollView;Landroid/view/View;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
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
    iget-object p0, p0, Lqz8;->X:Lw6;

    .line 10
    .line 11
    iget-object v1, p0, Lw6;->z0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lw6;->q0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lw6;->y0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lw6;->B0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lw6;->x0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lw6;->s0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lw6;->r0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lw6;->p0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lw6;->t0:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lqz8;->X:Lw6;

    .line 2
    .line 3
    iget-object v1, v0, Lw6;->z0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Lpz8;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, p0, v3}, Lpz8;-><init>(Lqz8;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lw6;->q0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v2, Lpz8;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v2, p0, v3}, Lpz8;-><init>(Lqz8;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lw6;->y0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v2, Lpz8;

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    invoke-direct {v2, p0, v3}, Lpz8;-><init>(Lqz8;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Lw6;->B0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v2, Lpz8;

    .line 51
    .line 52
    const/4 v3, 0x3

    .line 53
    invoke-direct {v2, p0, v3}, Lpz8;-><init>(Lqz8;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, Lw6;->A0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v2, Lpz8;

    .line 65
    .line 66
    const/4 v3, 0x4

    .line 67
    invoke-direct {v2, p0, v3}, Lpz8;-><init>(Lqz8;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, Lw6;->s0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v2, Lpz8;

    .line 79
    .line 80
    const/4 v3, 0x5

    .line 81
    invoke-direct {v2, p0, v3}, Lpz8;-><init>(Lqz8;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, Lw6;->r0:Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v2, Lpz8;

    .line 93
    .line 94
    const/4 v3, 0x6

    .line 95
    invoke-direct {v2, p0, v3}, Lpz8;-><init>(Lqz8;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, v0, Lw6;->p0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v2, Lpz8;

    .line 107
    .line 108
    const/4 v3, 0x7

    .line 109
    invoke-direct {v2, p0, v3}, Lpz8;-><init>(Lqz8;B)V

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, Lw6;->o0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    new-instance v1, Lpz8;

    .line 121
    .line 122
    const/16 v2, 0x8

    .line 123
    .line 124
    invoke-direct {v1, p0, v2}, Lpz8;-><init>(Lqz8;B)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public final q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Lqz8;->X:Lw6;

    .line 2
    .line 3
    return-object p0
.end method
