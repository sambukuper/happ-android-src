.class public final Lmy6;
.super Lxu1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgx3;
.implements Lw07;


# instance fields
.field public final L0:Lz47;

.field public M0:Lb1;

.field public N0:Lx2;

.field public O0:Z

.field public P0:Z

.field public Q0:Luy4;

.field public R0:Lad8;

.field public final S0:Lpe1;

.field public final T0:Lsy6;

.field public final U0:Lky6;

.field public final V0:Lai2;

.field public final W0:Lo41;


# direct methods
.method public constructor <init>(Ltd;Lw80;Lhe2;Lxz4;Lsd5;Lny6;ZZ)V
    .locals 10

    .line 1
    move/from16 v9, p7

    .line 2
    .line 3
    sget-object v0, Lu70;->a:Ly2;

    .line 4
    .line 5
    invoke-direct {p0, v0, v9, p4, p5}, Lxu1;-><init>(Lgn2;ZLxz4;Lsd5;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lz47;

    .line 9
    .line 10
    const/16 v1, 0x19

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lz47;-><init>(B)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lmy6;->L0:Lz47;

    .line 16
    .line 17
    new-instance v0, Lpe1;

    .line 18
    .line 19
    sget-object v1, Liy6;->c:Lfy6;

    .line 20
    .line 21
    new-instance v3, Ly45;

    .line 22
    .line 23
    invoke-direct {v3, v1}, Ly45;-><init>(Lfi1;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lbd1;

    .line 27
    .line 28
    invoke-direct {v1, v3}, Lbd1;-><init>(Lqe2;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Lpe1;-><init>(Lbd1;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lmy6;->S0:Lpe1;

    .line 35
    .line 36
    if-nez p3, :cond_0

    .line 37
    .line 38
    move-object v3, v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v3, p3

    .line 41
    :goto_0
    iget-object v6, p0, Lmy6;->L0:Lz47;

    .line 42
    .line 43
    new-instance v0, Lsy6;

    .line 44
    .line 45
    new-instance v8, Lly6;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v8, p0, v1}, Lly6;-><init>(Lmy6;B)V

    .line 49
    .line 50
    .line 51
    move-object v7, p0

    .line 52
    move-object v2, p1

    .line 53
    move-object v4, p5

    .line 54
    move-object/from16 v1, p6

    .line 55
    .line 56
    move/from16 v5, p8

    .line 57
    .line 58
    invoke-direct/range {v0 .. v8}, Lsy6;-><init>(Lny6;Ltd;Lhe2;Lsd5;ZLz47;Lmy6;Lly6;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lmy6;->T0:Lsy6;

    .line 62
    .line 63
    new-instance v8, Lky6;

    .line 64
    .line 65
    invoke-direct {v8, v0, v9}, Lky6;-><init>(Lsy6;Z)V

    .line 66
    .line 67
    .line 68
    iput-object v8, p0, Lmy6;->U0:Lky6;

    .line 69
    .line 70
    new-instance v1, Lai2;

    .line 71
    .line 72
    const/16 v2, 0xa

    .line 73
    .line 74
    const/4 v3, 0x2

    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-direct {v1, v3, v4, v2}, Lai2;-><init>(ILrn2;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lmy6;->V0:Lai2;

    .line 83
    .line 84
    new-instance v1, Lo41;

    .line 85
    .line 86
    new-instance v6, Lly6;

    .line 87
    .line 88
    const/4 v2, 0x1

    .line 89
    invoke-direct {v6, p0, v2}, Lly6;-><init>(Lmy6;B)V

    .line 90
    .line 91
    .line 92
    move-object v5, p2

    .line 93
    move-object v2, p5

    .line 94
    move/from16 v4, p8

    .line 95
    .line 96
    move-object v3, v0

    .line 97
    invoke-direct/range {v1 .. v6}, Lo41;-><init>(Lsd5;Lsy6;ZLw80;Lly6;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v1}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 101
    .line 102
    .line 103
    iput-object v1, p0, Lmy6;->W0:Lo41;

    .line 104
    .line 105
    iget-object v0, p0, Lmy6;->L0:Lz47;

    .line 106
    .line 107
    new-instance v2, Lz25;

    .line 108
    .line 109
    invoke-direct {v2, v8, v0}, Lz25;-><init>(Lt25;Lz47;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v2}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 113
    .line 114
    .line 115
    new-instance v0, Lt80;

    .line 116
    .line 117
    invoke-direct {v0}, Ljx4;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v1, v0, Lt80;->q0:Lo41;

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 123
    .line 124
    .line 125
    return-void
.end method


# virtual methods
.method public final F(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Lxu1;->u0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-static {p1}, Lw39;->N(Landroid/view/KeyEvent;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    sget-wide v4, Lax3;->D:J

    .line 11
    .line 12
    invoke-static {v2, v3, v4, v5}, Lax3;->a(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Lpu;->d(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    sget-wide v4, Lax3;->C:J

    .line 27
    .line 28
    invoke-static {v2, v3, v4, v5}, Lax3;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    :cond_0
    invoke-static {p1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x2

    .line 39
    if-ne v0, v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    iget-object v0, p0, Lmy6;->T0:Lsy6;

    .line 48
    .line 49
    iget-object v0, v0, Lsy6;->d:Lsd5;

    .line 50
    .line 51
    sget-object v2, Lsd5;->X:Lsd5;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    move v1, v3

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    const/16 v2, 0x20

    .line 59
    .line 60
    const-wide v4, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iget-object v6, p0, Lmy6;->W0:Lo41;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v6}, Lo41;->Z0()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    and-long/2addr v6, v4

    .line 74
    long-to-int v1, v6

    .line 75
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-static {p1}, Lpu;->d(I)J

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    sget-wide v8, Lax3;->C:J

    .line 84
    .line 85
    invoke-static {v6, v7, v8, v9}, Lax3;->a(JJ)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    int-to-float p1, v1

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    int-to-float p1, v1

    .line 94
    neg-float p1, p1

    .line 95
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v0, v0

    .line 100
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    int-to-long v6, p1

    .line 105
    shl-long/2addr v0, v2

    .line 106
    and-long/2addr v4, v6

    .line 107
    or-long/2addr v0, v4

    .line 108
    :goto_1
    move-wide v6, v0

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-virtual {v6}, Lo41;->Z0()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    shr-long/2addr v6, v2

    .line 115
    long-to-int v1, v6

    .line 116
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-static {p1}, Lpu;->d(I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    sget-wide v8, Lax3;->C:J

    .line 125
    .line 126
    invoke-static {v6, v7, v8, v9}, Lax3;->a(JJ)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    int-to-float p1, v1

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    int-to-float p1, v1

    .line 135
    neg-float p1, p1

    .line 136
    :goto_2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    int-to-long v6, p1

    .line 141
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    int-to-long v0, p1

    .line 146
    shl-long/2addr v6, v2

    .line 147
    and-long/2addr v0, v4

    .line 148
    or-long/2addr v0, v6

    .line 149
    goto :goto_1

    .line 150
    :goto_3
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v4, Lx2;

    .line 155
    .line 156
    const/4 v9, 0x1

    .line 157
    const/4 v8, 0x0

    .line 158
    move-object v5, p0

    .line 159
    invoke-direct/range {v4 .. v9}, Lx2;-><init>(Lmy6;JLq51;B)V

    .line 160
    .line 161
    .line 162
    const/4 p0, 0x3

    .line 163
    invoke-static {p1, v8, v8, v4, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 164
    .line 165
    .line 166
    return v3

    .line 167
    :cond_5
    return v1
.end method

.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Q0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lmy6;->Q0:Luy4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 10
    .line 11
    iput-object v1, v0, Lw55;->c:Lfi1;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lmy6;->R0:Lad8;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 22
    .line 23
    iput-object v1, v0, Lw55;->c:Lfi1;

    .line 24
    .line 25
    :cond_1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 35
    .line 36
    iget-object p0, p0, Lmy6;->S0:Lpe1;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Ly45;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ly45;-><init>(Lfi1;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lbd1;

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lbd1;-><init>(Lqe2;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lpe1;->a:Lbd1;

    .line 52
    .line 53
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxu1;->I()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lmy6;->Q0:Luy4;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 13
    .line 14
    iput-object v1, v0, Lw55;->c:Lfi1;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lmy6;->R0:Lad8;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 25
    .line 26
    iput-object v1, v0, Lw55;->c:Lfi1;

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lxu1;->I()V

    .line 29
    .line 30
    .line 31
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 41
    .line 42
    iget-object p0, p0, Lmy6;->S0:Lpe1;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v1, Ly45;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Ly45;-><init>(Lfi1;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lbd1;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lbd1;-><init>(Lqe2;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lpe1;->a:Lbd1;

    .line 58
    .line 59
    return-void
.end method

.method public final c1(Lpi;Lwu1;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lqk4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    iget-object p0, p0, Lmy6;->T0:Lsy6;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0, v1, v2}, Lqk4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lf15;->Y:Lf15;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0, p2}, Lsy6;->g(Lf15;Lrn2;Ls51;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lc71;->X:Lc71;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 23
    .line 24
    return-object p0
.end method

.method public final h(Lf17;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lxu1;->u0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lmy6;->M0:Lb1;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lmy6;->N0:Lx2;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lb1;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, p0, v2}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lmy6;->M0:Lb1;

    .line 21
    .line 22
    new-instance v0, Lx2;

    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, Lx2;-><init>(Lmy6;Lq51;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lmy6;->N0:Lx2;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lmy6;->M0:Lb1;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object v2, Ld17;->a:[Lnw3;

    .line 34
    .line 35
    sget-object v2, Ls07;->d:Le17;

    .line 36
    .line 37
    new-instance v3, Lq3;

    .line 38
    .line 39
    invoke-direct {v3, v1, v0}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v2, v3}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object p0, p0, Lmy6;->N0:Lx2;

    .line 46
    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    sget-object v0, Ld17;->a:[Lnw3;

    .line 50
    .line 51
    sget-object v0, Ls07;->e:Le17;

    .line 52
    .line 53
    invoke-interface {p1, v0, p0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method

.method public final h1(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i1(Lhu1;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lmy6;->L0:Lz47;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz47;->F()Lb71;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljy2;

    .line 13
    .line 14
    const/16 v2, 0x1d

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, p1, p0, v3, v2}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    invoke-static {v0, v3, v3, v1, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final l(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final t1(Ltd;Lw80;Lhe2;Lxz4;Lsd5;Lny6;ZZ)V
    .locals 6

    .line 1
    iget-boolean v3, p0, Lxu1;->u0:Z

    .line 2
    .line 3
    if-eq v3, p7, :cond_0

    .line 4
    .line 5
    iget-object v3, p0, Lmy6;->U0:Lky6;

    .line 6
    .line 7
    iput-boolean p7, v3, Lky6;->Y:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    iput-object v3, p0, Lmy6;->M0:Lb1;

    .line 11
    .line 12
    iput-object v3, p0, Lmy6;->N0:Lx2;

    .line 13
    .line 14
    invoke-static {p0}, Lch3;->I(Lw07;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    if-nez p3, :cond_1

    .line 18
    .line 19
    iget-object p3, p0, Lmy6;->S0:Lpe1;

    .line 20
    .line 21
    :cond_1
    iget-object v3, p0, Lmy6;->T0:Lsy6;

    .line 22
    .line 23
    iget-object v4, v3, Lsy6;->a:Lny6;

    .line 24
    .line 25
    invoke-static {v4, p6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x1

    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    iput-object p6, v3, Lsy6;->a:Lny6;

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v0, 0x0

    .line 37
    :goto_0
    iput-object p1, v3, Lsy6;->b:Ltd;

    .line 38
    .line 39
    iget-object p1, v3, Lsy6;->d:Lsd5;

    .line 40
    .line 41
    if-eq p1, p5, :cond_3

    .line 42
    .line 43
    iput-object p5, v3, Lsy6;->d:Lsd5;

    .line 44
    .line 45
    move-object p1, p5

    .line 46
    move v0, v5

    .line 47
    :cond_3
    iget-boolean v4, v3, Lsy6;->e:Z

    .line 48
    .line 49
    if-eq v4, p8, :cond_4

    .line 50
    .line 51
    iput-boolean p8, v3, Lsy6;->e:Z

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    move v5, v0

    .line 55
    :goto_1
    iput-object p3, v3, Lsy6;->c:Lhe2;

    .line 56
    .line 57
    iget-object p3, p0, Lmy6;->L0:Lz47;

    .line 58
    .line 59
    iput-object p3, v3, Lsy6;->f:Lz47;

    .line 60
    .line 61
    iget-object p3, p0, Lmy6;->W0:Lo41;

    .line 62
    .line 63
    iput-object p5, p3, Lo41;->q0:Lsd5;

    .line 64
    .line 65
    iput-boolean p8, p3, Lo41;->s0:Z

    .line 66
    .line 67
    iput-object p2, p3, Lo41;->t0:Lw80;

    .line 68
    .line 69
    sget-object v1, Lu70;->a:Ly2;

    .line 70
    .line 71
    sget-object p2, Lsd5;->X:Lsd5;

    .line 72
    .line 73
    if-ne p1, p2, :cond_5

    .line 74
    .line 75
    :goto_2
    move-object v0, p0

    .line 76
    move-object v4, p2

    .line 77
    move-object v3, p4

    .line 78
    move v2, p7

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    sget-object p2, Lsd5;->Y:Lsd5;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :goto_3
    invoke-virtual/range {v0 .. v5}, Lxu1;->s1(Lgn2;ZLxz4;Lsd5;Z)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final z(Laq5;Lbq5;J)V
    .locals 19

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v0, v8, Laq5;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lhq5;

    .line 21
    .line 22
    iget-object v5, v2, Lxu1;->t0:Lgn2;

    .line 23
    .line 24
    iget v4, v4, Lhq5;->i:I

    .line 25
    .line 26
    new-instance v6, Loq5;

    .line 27
    .line 28
    invoke-direct {v6, v4}, Loq5;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v5, v6}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    invoke-super/range {p0 .. p4}, Lxu1;->z(Laq5;Lbq5;J)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    iget-boolean v0, v2, Lxu1;->u0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_14

    .line 53
    .line 54
    iget-object v0, v2, Lxu1;->C0:Lor2;

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    new-instance v0, Lor2;

    .line 59
    .line 60
    invoke-direct {v0, v2}, Lor2;-><init>(Lnr2;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 64
    .line 65
    .line 66
    iput-object v0, v2, Lxu1;->C0:Lor2;

    .line 67
    .line 68
    :cond_2
    const/4 v11, 0x0

    .line 69
    const/4 v12, 0x6

    .line 70
    const/16 v13, 0xc

    .line 71
    .line 72
    const/4 v14, 0x3

    .line 73
    sget-object v15, Lbq5;->X:Lbq5;

    .line 74
    .line 75
    const/4 v0, 0x1

    .line 76
    if-ne v9, v15, :cond_4

    .line 77
    .line 78
    iget v1, v8, Laq5;->f:I

    .line 79
    .line 80
    if-ne v1, v12, :cond_4

    .line 81
    .line 82
    iget-boolean v1, v2, Lmy6;->O0:Z

    .line 83
    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    new-instance v1, Luy4;

    .line 87
    .line 88
    new-instance v3, Lyr2;

    .line 89
    .line 90
    invoke-static {v2}, Lys0;->S(Lnh1;)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-direct {v3, v4, v14}, Lyr2;-><init>(Ljava/lang/Object;B)V

    .line 103
    .line 104
    .line 105
    move v4, v0

    .line 106
    new-instance v0, Lyy0;

    .line 107
    .line 108
    const/4 v6, 0x4

    .line 109
    const/4 v7, 0x2

    .line 110
    move-object v5, v1

    .line 111
    const/4 v1, 0x2

    .line 112
    move-object/from16 v16, v3

    .line 113
    .line 114
    const-class v3, Lmy6;

    .line 115
    .line 116
    move/from16 v17, v4

    .line 117
    .line 118
    const-string v4, "onMouseWheelScrollStopped"

    .line 119
    .line 120
    move-object/from16 v18, v5

    .line 121
    .line 122
    const-string v5, "onMouseWheelScrollStopped-TH1AsA0(J)V"

    .line 123
    .line 124
    move-object/from16 v12, v16

    .line 125
    .line 126
    move/from16 v14, v17

    .line 127
    .line 128
    move-object/from16 v10, v18

    .line 129
    .line 130
    invoke-direct/range {v0 .. v7}, Lyy0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 131
    .line 132
    .line 133
    invoke-static {v2}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 138
    .line 139
    iget-object v3, v2, Lmy6;->T0:Lsy6;

    .line 140
    .line 141
    invoke-direct {v10, v3, v12, v0, v1}, Luy4;-><init>(Lsy6;Lyr2;Lyy0;Lfi1;)V

    .line 142
    .line 143
    .line 144
    iput-object v10, v2, Lmy6;->Q0:Luy4;

    .line 145
    .line 146
    iput-boolean v14, v2, Lmy6;->O0:Z

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_3
    move v14, v0

    .line 150
    :goto_2
    iget-object v0, v2, Lmy6;->Q0:Luy4;

    .line 151
    .line 152
    if-eqz v0, :cond_5

    .line 153
    .line 154
    invoke-virtual {v2}, Ljx4;->M0()Lb71;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    iget-object v3, v0, Luy4;->h:Log7;

    .line 159
    .line 160
    if-nez v3, :cond_5

    .line 161
    .line 162
    new-instance v3, Ly9;

    .line 163
    .line 164
    invoke-direct {v3, v0, v11, v13}, Ly9;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 165
    .line 166
    .line 167
    const/4 v4, 0x3

    .line 168
    invoke-static {v1, v11, v11, v3, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iput-object v1, v0, Luy4;->h:Log7;

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_4
    move v14, v0

    .line 176
    :cond_5
    :goto_3
    iget-object v0, v2, Lmy6;->Q0:Luy4;

    .line 177
    .line 178
    sget-object v10, Lbq5;->Y:Lbq5;

    .line 179
    .line 180
    if-eqz v0, :cond_9

    .line 181
    .line 182
    iget v1, v8, Laq5;->f:I

    .line 183
    .line 184
    const/4 v3, 0x6

    .line 185
    if-ne v1, v3, :cond_9

    .line 186
    .line 187
    iget-object v1, v8, Laq5;->a:Ljava/util/List;

    .line 188
    .line 189
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    const/4 v4, 0x0

    .line 194
    :goto_4
    if-ge v4, v3, :cond_7

    .line 195
    .line 196
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    check-cast v5, Lhq5;

    .line 201
    .line 202
    invoke-virtual {v5}, Lhq5;->c()Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    if-eqz v5, :cond_6

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_7
    if-ne v9, v15, :cond_8

    .line 213
    .line 214
    iget-boolean v1, v0, Lw55;->d:Z

    .line 215
    .line 216
    if-eqz v1, :cond_8

    .line 217
    .line 218
    invoke-virtual {v0, v8}, Luy4;->f(Laq5;)Z

    .line 219
    .line 220
    .line 221
    invoke-static {v8}, Lw55;->a(Laq5;)V

    .line 222
    .line 223
    .line 224
    :cond_8
    if-ne v9, v10, :cond_9

    .line 225
    .line 226
    iget-boolean v1, v0, Lw55;->d:Z

    .line 227
    .line 228
    if-nez v1, :cond_9

    .line 229
    .line 230
    invoke-virtual {v0, v8}, Luy4;->f(Laq5;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_9

    .line 235
    .line 236
    invoke-static {v8}, Lw55;->a(Laq5;)V

    .line 237
    .line 238
    .line 239
    :cond_9
    :goto_5
    const/16 v12, 0xb

    .line 240
    .line 241
    const/16 v0, 0xa

    .line 242
    .line 243
    if-ne v9, v15, :cond_d

    .line 244
    .line 245
    iget v1, v8, Laq5;->f:I

    .line 246
    .line 247
    if-ne v1, v0, :cond_a

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_a
    if-ne v1, v12, :cond_b

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_b
    if-ne v1, v13, :cond_d

    .line 254
    .line 255
    :goto_6
    iget-boolean v1, v2, Lmy6;->P0:Z

    .line 256
    .line 257
    if-nez v1, :cond_c

    .line 258
    .line 259
    new-instance v1, Lad8;

    .line 260
    .line 261
    move v3, v0

    .line 262
    new-instance v0, Lyy0;

    .line 263
    .line 264
    const/4 v6, 0x4

    .line 265
    const/4 v7, 0x3

    .line 266
    move-object v4, v1

    .line 267
    const/4 v1, 0x2

    .line 268
    move v5, v3

    .line 269
    const-class v3, Lmy6;

    .line 270
    .line 271
    move-object/from16 v16, v4

    .line 272
    .line 273
    const-string v4, "onTrackpadScrollStopped"

    .line 274
    .line 275
    move/from16 v17, v5

    .line 276
    .line 277
    const-string v5, "onTrackpadScrollStopped-TH1AsA0(J)V"

    .line 278
    .line 279
    move-object/from16 v13, v16

    .line 280
    .line 281
    move/from16 v12, v17

    .line 282
    .line 283
    invoke-direct/range {v0 .. v7}, Lyy0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 284
    .line 285
    .line 286
    invoke-static {v2}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 291
    .line 292
    iget-object v3, v2, Lmy6;->T0:Lsy6;

    .line 293
    .line 294
    invoke-direct {v13, v3, v0, v1}, Lad8;-><init>(Lsy6;Lyy0;Lfi1;)V

    .line 295
    .line 296
    .line 297
    iput-object v13, v2, Lmy6;->R0:Lad8;

    .line 298
    .line 299
    iput-boolean v14, v2, Lmy6;->P0:Z

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_c
    move v12, v0

    .line 303
    :goto_7
    iget-object v0, v2, Lmy6;->R0:Lad8;

    .line 304
    .line 305
    if-eqz v0, :cond_e

    .line 306
    .line 307
    invoke-virtual {v2}, Ljx4;->M0()Lb71;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    iget-object v3, v0, Lad8;->g:Log7;

    .line 312
    .line 313
    if-nez v3, :cond_e

    .line 314
    .line 315
    new-instance v3, Lwu1;

    .line 316
    .line 317
    invoke-direct {v3, v0, v11, v12}, Lwu1;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 318
    .line 319
    .line 320
    const/4 v4, 0x3

    .line 321
    invoke-static {v1, v11, v11, v3, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    iput-object v1, v0, Lad8;->g:Log7;

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_d
    move v12, v0

    .line 329
    :cond_e
    :goto_8
    iget-object v0, v2, Lmy6;->R0:Lad8;

    .line 330
    .line 331
    if-eqz v0, :cond_14

    .line 332
    .line 333
    iget v1, v8, Laq5;->f:I

    .line 334
    .line 335
    if-ne v1, v12, :cond_f

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_f
    const/16 v2, 0xb

    .line 339
    .line 340
    if-ne v1, v2, :cond_10

    .line 341
    .line 342
    goto :goto_9

    .line 343
    :cond_10
    const/16 v2, 0xc

    .line 344
    .line 345
    if-ne v1, v2, :cond_14

    .line 346
    .line 347
    :goto_9
    iget-object v1, v8, Laq5;->a:Ljava/util/List;

    .line 348
    .line 349
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    const/4 v3, 0x0

    .line 354
    :goto_a
    if-ge v3, v2, :cond_12

    .line 355
    .line 356
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    check-cast v4, Lhq5;

    .line 361
    .line 362
    invoke-virtual {v4}, Lhq5;->c()Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_11

    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_11
    add-int/lit8 v3, v3, 0x1

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_12
    if-ne v9, v15, :cond_13

    .line 373
    .line 374
    iget-boolean v1, v0, Lw55;->d:Z

    .line 375
    .line 376
    if-eqz v1, :cond_13

    .line 377
    .line 378
    invoke-virtual {v0, v8}, Lad8;->d(Laq5;)Z

    .line 379
    .line 380
    .line 381
    invoke-static {v8}, Lw55;->a(Laq5;)V

    .line 382
    .line 383
    .line 384
    :cond_13
    if-ne v9, v10, :cond_14

    .line 385
    .line 386
    iget-boolean v1, v0, Lw55;->d:Z

    .line 387
    .line 388
    if-nez v1, :cond_14

    .line 389
    .line 390
    invoke-virtual {v0, v8}, Lad8;->d(Laq5;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_14

    .line 395
    .line 396
    invoke-static {v8}, Lw55;->a(Laq5;)V

    .line 397
    .line 398
    .line 399
    :cond_14
    :goto_b
    return-void
.end method
