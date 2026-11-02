.class public final synthetic Lnx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lb83;

.field public final synthetic Z:I

.field public final synthetic f0:Lgn2;

.field public final synthetic g0:Lkx4;


# direct methods
.method public synthetic constructor <init>(Lb83;ILgn2;Lkx4;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lnx2;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnx2;->Y:Lb83;

    .line 8
    .line 9
    iput p2, p0, Lnx2;->Z:I

    .line 10
    .line 11
    iput-object p3, p0, Lnx2;->f0:Lgn2;

    .line 12
    .line 13
    iput-object p4, p0, Lnx2;->g0:Lkx4;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lb83;ILgn2;Lkx4;I)V
    .locals 0

    .line 16
    const/4 p5, 0x1

    iput-byte p5, p0, Lnx2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnx2;->Y:Lb83;

    iput p2, p0, Lnx2;->Z:I

    iput-object p3, p0, Lnx2;->f0:Lgn2;

    iput-object p4, p0, Lnx2;->g0:Lkx4;

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lnx2;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v7, p1

    .line 11
    .line 12
    check-cast v7, Llp2;

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/16 v1, 0xc01

    .line 22
    .line 23
    invoke-static {v1}, Lw79;->P(I)I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    iget-object v3, v0, Lnx2;->Y:Lb83;

    .line 28
    .line 29
    iget v4, v0, Lnx2;->Z:I

    .line 30
    .line 31
    iget-object v5, v0, Lnx2;->f0:Lgn2;

    .line 32
    .line 33
    iget-object v6, v0, Lnx2;->g0:Lkx4;

    .line 34
    .line 35
    invoke-static/range {v3 .. v8}, Lz68;->d(Lb83;ILgn2;Lkx4;Llp2;I)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_0
    move-object/from16 v14, p1

    .line 40
    .line 41
    check-cast v14, Llp2;

    .line 42
    .line 43
    move-object/from16 v1, p2

    .line 44
    .line 45
    check-cast v1, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    and-int/lit8 v3, v1, 0x3

    .line 52
    .line 53
    const/4 v4, 0x2

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x1

    .line 56
    if-eq v3, v4, :cond_0

    .line 57
    .line 58
    move v3, v6

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v3, v5

    .line 61
    :goto_0
    and-int/2addr v1, v6

    .line 62
    invoke-virtual {v14, v1, v3}, Llp2;->N(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    iget-object v1, v0, Lnx2;->Y:Lb83;

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    move v3, v5

    .line 75
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_6

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    add-int/lit8 v7, v3, 0x1

    .line 86
    .line 87
    if-ltz v3, :cond_4

    .line 88
    .line 89
    move-object v9, v4

    .line 90
    check-cast v9, Lox2;

    .line 91
    .line 92
    const v4, 0x75d0e9f

    .line 93
    .line 94
    .line 95
    iget-object v8, v9, Lox2;->b:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v14, v4, v8}, Llp2;->U(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget v4, v0, Lnx2;->Z:I

    .line 101
    .line 102
    if-ne v4, v3, :cond_1

    .line 103
    .line 104
    move v10, v6

    .line 105
    goto :goto_2

    .line 106
    :cond_1
    move v10, v5

    .line 107
    :goto_2
    new-instance v13, Lig5;

    .line 108
    .line 109
    const/high16 v4, 0x40800000    # 4.0f

    .line 110
    .line 111
    const/high16 v8, 0x41800000    # 16.0f

    .line 112
    .line 113
    invoke-direct {v13, v4, v4, v8, v4}, Lig5;-><init>(FFFF)V

    .line 114
    .line 115
    .line 116
    iget-object v4, v0, Lnx2;->f0:Lgn2;

    .line 117
    .line 118
    invoke-virtual {v14, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-virtual {v14, v3}, Llp2;->d(I)Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    or-int/2addr v8, v11

    .line 127
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    if-nez v8, :cond_2

    .line 132
    .line 133
    sget-object v8, Lzz0;->a:Lbe;

    .line 134
    .line 135
    if-ne v11, v8, :cond_3

    .line 136
    .line 137
    :cond_2
    new-instance v11, Llx2;

    .line 138
    .line 139
    invoke-direct {v11, v4, v3, v5}, Llx2;-><init>(Lgn2;IB)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v14, v11}, Llp2;->g0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    check-cast v11, Ldn2;

    .line 146
    .line 147
    const/16 v15, 0xc00

    .line 148
    .line 149
    iget-object v12, v0, Lnx2;->g0:Lkx4;

    .line 150
    .line 151
    invoke-static/range {v9 .. v15}, Lz68;->e(Lox2;ZLdn2;Lkx4;Lig5;Llp2;I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v14, v5}, Llp2;->p(Z)V

    .line 155
    .line 156
    .line 157
    move v3, v7

    .line 158
    goto :goto_1

    .line 159
    :cond_4
    invoke-static {}, Li21;->X()V

    .line 160
    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    throw v0

    .line 164
    :cond_5
    invoke-virtual {v14}, Llp2;->Q()V

    .line 165
    .line 166
    .line 167
    :cond_6
    return-object v2

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
