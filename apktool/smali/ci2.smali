.class public final Lci2;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw07;
.implements Las2;
.implements Ls01;
.implements Lw85;
.implements Lye8;


# static fields
.field public static final y0:Lk42;


# instance fields
.field public s0:Lxz4;

.field public final t0:Lgn2;

.field public u0:Lyg2;

.field public v0:Lk64;

.field public w0:Li55;

.field public final x0:Lai2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk42;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lci2;->y0:Lk42;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lxz4;ILgn2;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lci2;->s0:Lxz4;

    .line 5
    .line 6
    iput-object p3, p0, Lci2;->t0:Lgn2;

    .line 7
    .line 8
    new-instance v0, Lyn1;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v1, 0x2

    .line 13
    const-class v3, Lci2;

    .line 14
    .line 15
    const-string v4, "onFocusStateChange"

    .line 16
    .line 17
    const-string v5, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 18
    .line 19
    move-object v2, p0

    .line 20
    invoke-direct/range {v0 .. v7}, Lyn1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Lai2;

    .line 24
    .line 25
    const/16 p1, 0xa

    .line 26
    .line 27
    invoke-direct {p0, p2, v0, p1}, Lai2;-><init>(ILrn2;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p0}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 31
    .line 32
    .line 33
    iput-object p0, v2, Lci2;->x0:Lai2;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Lxz4;Lt48;I)V
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x1

    .line 36
    invoke-direct {p0, p1, p3, p2}, Lci2;-><init>(Lxz4;ILgn2;)V

    return-void
.end method


# virtual methods
.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final S0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lci2;->v0:Lk64;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lk64;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lci2;->v0:Lk64;

    .line 10
    .line 11
    return-void
.end method

.method public final b1(Lxz4;Lvf3;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lm51;

    .line 10
    .line 11
    iget-object v0, v0, Lm51;->Y:Ls61;

    .line 12
    .line 13
    sget-object v1, Loy1;->E0:Loy1;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ls61;->H0(Lr61;)Lq61;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lbm3;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v1, Lp0;

    .line 25
    .line 26
    const/16 v2, 0x19

    .line 27
    .line 28
    invoke-direct {v1, p1, p2, v2}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lbm3;->D(Lgn2;)Lgq1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v4, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v4, v5

    .line 38
    :goto_0
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v1, Lr0;

    .line 43
    .line 44
    const/16 v6, 0x16

    .line 45
    .line 46
    move-object v2, p1

    .line 47
    move-object v3, p2

    .line 48
    invoke-direct/range {v1 .. v6}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x3

    .line 52
    invoke-static {p0, v5, v5, v1, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    move-object v2, p1

    .line 57
    move-object v3, p2

    .line 58
    invoke-virtual {v2, v3}, Lxz4;->b(Lvf3;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final c1()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Ljx4;->X:Ljx4;

    .line 6
    .line 7
    iget-boolean v0, v0, Ljx4;->p0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "visitAncestors called on an unattached node"

    .line 12
    .line 13
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ljx4;->X:Ljx4;

    .line 17
    .line 18
    iget-object v0, v0, Ljx4;->g0:Ljx4;

    .line 19
    .line 20
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    if-eqz p0, :cond_c

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 27
    .line 28
    iget-object v1, v1, Lt6;->i0:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljx4;

    .line 31
    .line 32
    iget v1, v1, Ljx4;->f0:I

    .line 33
    .line 34
    const/high16 v2, 0x40000

    .line 35
    .line 36
    and-int/2addr v1, v2

    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v1, :cond_a

    .line 39
    .line 40
    :goto_1
    if-eqz v0, :cond_a

    .line 41
    .line 42
    iget v1, v0, Ljx4;->Z:I

    .line 43
    .line 44
    and-int/2addr v1, v2

    .line 45
    if-eqz v1, :cond_9

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    move-object v4, v3

    .line 49
    :goto_2
    if-eqz v1, :cond_9

    .line 50
    .line 51
    instance-of v5, v1, Lye8;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    move-object v5, v1

    .line 56
    check-cast v5, Lye8;

    .line 57
    .line 58
    invoke-interface {v5}, Lye8;->o()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v6, Ldi2;->q0:Lk32;

    .line 63
    .line 64
    if-eq v6, v5, :cond_1

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_1
    return-void

    .line 68
    :cond_2
    :goto_3
    iget v5, v1, Ljx4;->Z:I

    .line 69
    .line 70
    and-int/2addr v5, v2

    .line 71
    if-eqz v5, :cond_8

    .line 72
    .line 73
    instance-of v5, v1, Loh1;

    .line 74
    .line 75
    if-eqz v5, :cond_8

    .line 76
    .line 77
    move-object v5, v1

    .line 78
    check-cast v5, Loh1;

    .line 79
    .line 80
    iget-object v5, v5, Loh1;->r0:Ljx4;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    move v7, v6

    .line 84
    :goto_4
    const/4 v8, 0x1

    .line 85
    if-eqz v5, :cond_7

    .line 86
    .line 87
    iget v9, v5, Ljx4;->Z:I

    .line 88
    .line 89
    and-int/2addr v9, v2

    .line 90
    if-eqz v9, :cond_6

    .line 91
    .line 92
    add-int/lit8 v7, v7, 0x1

    .line 93
    .line 94
    if-ne v7, v8, :cond_3

    .line 95
    .line 96
    move-object v1, v5

    .line 97
    goto :goto_5

    .line 98
    :cond_3
    if-nez v4, :cond_4

    .line 99
    .line 100
    new-instance v4, Lc15;

    .line 101
    .line 102
    const/16 v8, 0x10

    .line 103
    .line 104
    new-array v8, v8, [Ljx4;

    .line 105
    .line 106
    invoke-direct {v4, v6, v8}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-virtual {v4, v1}, Lc15;->b(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move-object v1, v3

    .line 115
    :cond_5
    invoke-virtual {v4, v5}, Lc15;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    :goto_5
    iget-object v5, v5, Ljx4;->h0:Ljx4;

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    if-ne v7, v8, :cond_8

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_8
    invoke-static {v4}, Lyn0;->T(Lc15;)Ljx4;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    goto :goto_2

    .line 129
    :cond_9
    iget-object v0, v0, Ljx4;->g0:Ljx4;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_a
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-eqz p0, :cond_b

    .line 137
    .line 138
    iget-object v0, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 139
    .line 140
    if-eqz v0, :cond_b

    .line 141
    .line 142
    iget-object v0, v0, Lt6;->h0:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Lf18;

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_b
    move-object v0, v3

    .line 148
    goto :goto_0

    .line 149
    :cond_c
    return-void
.end method

.method public final d1(Lxz4;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lci2;->s0:Lxz4;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lci2;->s0:Lxz4;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lci2;->u0:Lyg2;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v2, Lzg2;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Lzg2;-><init>(Lyg2;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lxz4;->b(Lvf3;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lci2;->u0:Lyg2;

    .line 27
    .line 28
    iput-object p1, p0, Lci2;->s0:Lxz4;

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final e0(Li55;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lci2;->w0:Li55;

    .line 2
    .line 3
    iget-object v0, p0, Lci2;->x0:Lai2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lai2;->d1()Lyh2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lyh2;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Li55;->V0()Ljx4;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-boolean p1, p1, Ljx4;->p0:Z

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, Lci2;->w0:Li55;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Li55;->V0()Ljx4;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-boolean p1, p1, Ljx4;->p0:Z

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lci2;->c1()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0}, Lci2;->c1()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final h(Lf17;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lci2;->x0:Lai2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lai2;->d1()Lyh2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lyh2;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Ld17;->a:[Lnw3;

    .line 12
    .line 13
    sget-object v1, Lc17;->l:Le17;

    .line 14
    .line 15
    sget-object v2, Ld17;->a:[Lnw3;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    aget-object v2, v2, v3

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lub;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/16 v9, 0xc

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const-class v5, Lci2;

    .line 37
    .line 38
    const-string v6, "requestFocus"

    .line 39
    .line 40
    const-string v7, "requestFocus()Z"

    .line 41
    .line 42
    move-object v4, p0

    .line 43
    invoke-direct/range {v2 .. v9}, Lub;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Ls07;->w:Le17;

    .line 47
    .line 48
    new-instance v0, Lq3;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v0, v1, v2}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, p0, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final o()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lci2;->y0:Lk42;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q0()V
    .locals 3

    .line 1
    new-instance v0, Lea6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lp5;

    .line 7
    .line 8
    const/16 v2, 0x18

    .line 9
    .line 10
    invoke-direct {v1, v0, p0, v2}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1}, Lch3;->N(Ljx4;Ldn2;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lk64;

    .line 19
    .line 20
    iget-object v1, p0, Lci2;->x0:Lai2;

    .line 21
    .line 22
    invoke-virtual {v1}, Lai2;->d1()Lyh2;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lyh2;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lci2;->v0:Lk64;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, Lk64;->b()V

    .line 37
    .line 38
    .line 39
    :cond_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lk64;->a()Lk64;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    iput-object v0, p0, Lci2;->v0:Lk64;

    .line 47
    .line 48
    :cond_2
    return-void
.end method
