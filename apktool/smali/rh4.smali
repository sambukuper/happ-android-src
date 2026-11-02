.class public final synthetic Lrh4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Llf4;

.field public final synthetic Z:Loh2;

.field public final synthetic f0:Lgn2;


# direct methods
.method public synthetic constructor <init>(Llf4;Loh2;Lgn2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lrh4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrh4;->Y:Llf4;

    .line 4
    .line 5
    iput-object p2, p0, Lrh4;->Z:Loh2;

    .line 6
    .line 7
    iput-object p3, p0, Lrh4;->f0:Lgn2;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lrh4;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Lk44;

    .line 17
    .line 18
    move-object/from16 v13, p2

    .line 19
    .line 20
    check-cast v13, Llp2;

    .line 21
    .line 22
    move-object/from16 v6, p3

    .line 23
    .line 24
    check-cast v6, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v1, v6, 0x11

    .line 34
    .line 35
    if-eq v1, v4, :cond_0

    .line 36
    .line 37
    move v3, v5

    .line 38
    :cond_0
    and-int/lit8 v1, v6, 0x1

    .line 39
    .line 40
    invoke-virtual {v13, v1, v3}, Llp2;->N(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 47
    .line 48
    const v14, 0x180c00

    .line 49
    .line 50
    .line 51
    const/16 v15, 0x30

    .line 52
    .line 53
    iget-object v6, v0, Lrh4;->Y:Llf4;

    .line 54
    .line 55
    iget-object v7, v0, Lrh4;->Z:Loh2;

    .line 56
    .line 57
    iget-object v8, v0, Lrh4;->f0:Lgn2;

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    invoke-static/range {v6 .. v15}, Ljm4;->j(Llf4;Loh2;Lgn2;Lkx4;Ldn2;ZZLlp2;II)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v13}, Llp2;->Q()V

    .line 67
    .line 68
    .line 69
    :goto_0
    return-object v2

    .line 70
    :pswitch_0
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, Lk44;

    .line 73
    .line 74
    move-object/from16 v13, p2

    .line 75
    .line 76
    check-cast v13, Llp2;

    .line 77
    .line 78
    move-object/from16 v6, p3

    .line 79
    .line 80
    check-cast v6, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    and-int/lit8 v1, v6, 0x11

    .line 90
    .line 91
    if-eq v1, v4, :cond_2

    .line 92
    .line 93
    move v3, v5

    .line 94
    :cond_2
    and-int/lit8 v1, v6, 0x1

    .line 95
    .line 96
    invoke-virtual {v13, v1, v3}, Llp2;->N(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 103
    .line 104
    const v14, 0x180c00

    .line 105
    .line 106
    .line 107
    const/16 v15, 0x30

    .line 108
    .line 109
    iget-object v6, v0, Lrh4;->Y:Llf4;

    .line 110
    .line 111
    iget-object v7, v0, Lrh4;->Z:Loh2;

    .line 112
    .line 113
    iget-object v8, v0, Lrh4;->f0:Lgn2;

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x0

    .line 118
    invoke-static/range {v6 .. v15}, Ljm4;->j(Llf4;Loh2;Lgn2;Lkx4;Ldn2;ZZLlp2;II)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-virtual {v13}, Llp2;->Q()V

    .line 123
    .line 124
    .line 125
    :goto_1
    return-object v2

    .line 126
    :pswitch_1
    move-object/from16 v1, p1

    .line 127
    .line 128
    check-cast v1, Lk44;

    .line 129
    .line 130
    move-object/from16 v13, p2

    .line 131
    .line 132
    check-cast v13, Llp2;

    .line 133
    .line 134
    move-object/from16 v6, p3

    .line 135
    .line 136
    check-cast v6, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    and-int/lit8 v1, v6, 0x11

    .line 146
    .line 147
    if-eq v1, v4, :cond_4

    .line 148
    .line 149
    move v3, v5

    .line 150
    :cond_4
    and-int/lit8 v1, v6, 0x1

    .line 151
    .line 152
    invoke-virtual {v13, v1, v3}, Llp2;->N(IZ)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_5

    .line 157
    .line 158
    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 159
    .line 160
    const v14, 0x180c00

    .line 161
    .line 162
    .line 163
    const/16 v15, 0x30

    .line 164
    .line 165
    iget-object v6, v0, Lrh4;->Y:Llf4;

    .line 166
    .line 167
    iget-object v7, v0, Lrh4;->Z:Loh2;

    .line 168
    .line 169
    iget-object v8, v0, Lrh4;->f0:Lgn2;

    .line 170
    .line 171
    const/4 v10, 0x0

    .line 172
    const/4 v11, 0x0

    .line 173
    const/4 v12, 0x0

    .line 174
    invoke-static/range {v6 .. v15}, Ljm4;->j(Llf4;Loh2;Lgn2;Lkx4;Ldn2;ZZLlp2;II)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_5
    invoke-virtual {v13}, Llp2;->Q()V

    .line 179
    .line 180
    .line 181
    :goto_2
    return-object v2

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
