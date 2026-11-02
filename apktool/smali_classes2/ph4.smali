.class public final synthetic Lph4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:Lsf4;

.field public final synthetic Y:Llf4;

.field public final synthetic Z:Lcm5;

.field public final synthetic f0:Lgn2;

.field public final synthetic g0:I

.field public final synthetic h0:Loh2;

.field public final synthetic i0:Loh2;

.field public final synthetic j0:Loh2;


# direct methods
.method public synthetic constructor <init>(Lsf4;Llf4;Lcm5;Lgn2;ILoh2;Loh2;Loh2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lph4;->X:Lsf4;

    .line 5
    .line 6
    iput-object p2, p0, Lph4;->Y:Llf4;

    .line 7
    .line 8
    iput-object p3, p0, Lph4;->Z:Lcm5;

    .line 9
    .line 10
    iput-object p4, p0, Lph4;->f0:Lgn2;

    .line 11
    .line 12
    iput p5, p0, Lph4;->g0:I

    .line 13
    .line 14
    iput-object p6, p0, Lph4;->h0:Loh2;

    .line 15
    .line 16
    iput-object p7, p0, Lph4;->i0:Loh2;

    .line 17
    .line 18
    iput-object p8, p0, Lph4;->j0:Loh2;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lph4;->Y:Llf4;

    .line 4
    .line 5
    iget-object v2, v1, Llf4;->b:Ljava/lang/String;

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    check-cast v3, Lk44;

    .line 10
    .line 11
    move-object/from16 v7, p2

    .line 12
    .line 13
    check-cast v7, Llp2;

    .line 14
    .line 15
    move-object/from16 v4, p3

    .line 16
    .line 17
    check-cast v4, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    and-int/lit8 v3, v4, 0x11

    .line 27
    .line 28
    const/16 v5, 0x10

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    if-eq v3, v5, :cond_0

    .line 32
    .line 33
    move v3, v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v3, 0x0

    .line 36
    :goto_0
    and-int/2addr v4, v6

    .line 37
    invoke-virtual {v7, v4, v3}, Llp2;->N(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 44
    .line 45
    iget-object v9, v0, Lph4;->X:Lsf4;

    .line 46
    .line 47
    iget-object v4, v9, Lsf4;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v4, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iget-object v11, v0, Lph4;->Z:Lcm5;

    .line 54
    .line 55
    invoke-interface {v11, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    check-cast v2, Loh2;

    .line 62
    .line 63
    invoke-virtual {v7, v9}, Llp2;->f(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget v10, v0, Lph4;->g0:I

    .line 68
    .line 69
    invoke-virtual {v7, v10}, Llp2;->d(I)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    or-int/2addr v4, v6

    .line 74
    invoke-virtual {v7, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    or-int/2addr v4, v6

    .line 79
    iget-object v12, v0, Lph4;->h0:Loh2;

    .line 80
    .line 81
    invoke-virtual {v7, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    or-int/2addr v4, v6

    .line 86
    iget-object v13, v0, Lph4;->i0:Loh2;

    .line 87
    .line 88
    invoke-virtual {v7, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    or-int/2addr v4, v6

    .line 93
    iget-object v14, v0, Lph4;->j0:Loh2;

    .line 94
    .line 95
    invoke-virtual {v7, v14}, Llp2;->f(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    or-int/2addr v4, v6

    .line 100
    invoke-virtual {v7}, Llp2;->K()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    if-nez v4, :cond_1

    .line 105
    .line 106
    sget-object v4, Lzz0;->a:Lbe;

    .line 107
    .line 108
    if-ne v6, v4, :cond_2

    .line 109
    .line 110
    :cond_1
    new-instance v8, Lqh4;

    .line 111
    .line 112
    invoke-direct/range {v8 .. v14}, Lqh4;-><init>(Lsf4;ILcm5;Loh2;Loh2;Loh2;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object v6, v8

    .line 119
    :cond_2
    move-object v4, v6

    .line 120
    check-cast v4, Ldn2;

    .line 121
    .line 122
    const/16 v8, 0xc00

    .line 123
    .line 124
    const/16 v9, 0x40

    .line 125
    .line 126
    iget-object v0, v0, Lph4;->f0:Lgn2;

    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    move-object v15, v2

    .line 130
    move-object v2, v0

    .line 131
    move-object v0, v1

    .line 132
    move-object v1, v15

    .line 133
    invoke-static/range {v0 .. v9}, Ljm4;->j(Llf4;Loh2;Lgn2;Lkx4;Ldn2;ZZLlp2;II)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    const-string v0, "Required value was null."

    .line 138
    .line 139
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/4 v0, 0x0

    .line 143
    return-object v0

    .line 144
    :cond_4
    invoke-virtual {v7}, Llp2;->Q()V

    .line 145
    .line 146
    .line 147
    :goto_1
    sget-object v0, Ldn8;->a:Ldn8;

    .line 148
    .line 149
    return-object v0
.end method
