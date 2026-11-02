.class public final Lau0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ltb3;

.field public final synthetic Z:Z

.field public final synthetic f0:Ldn2;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ltb3;ZLdn2;Ldn2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lau0;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lau0;->Y:Ltb3;

    .line 8
    .line 9
    iput-boolean p2, p0, Lau0;->Z:Z

    .line 10
    .line 11
    iput-object p3, p0, Lau0;->f0:Ldn2;

    .line 12
    .line 13
    iput-object p4, p0, Lau0;->g0:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ltb3;ZLkl6;Ldn2;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lau0;->X:B

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lau0;->Y:Ltb3;

    iput-boolean p2, p0, Lau0;->Z:Z

    iput-object p3, p0, Lau0;->g0:Ljava/lang/Object;

    iput-object p4, p0, Lau0;->f0:Ldn2;

    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lau0;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lau0;->g0:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, Lau0;->Y:Ltb3;

    .line 9
    .line 10
    sget-object v5, Lhx4;->X:Lhx4;

    .line 11
    .line 12
    sget-object v6, Lzz0;->a:Lbe;

    .line 13
    .line 14
    const v7, -0x5af0b3b9

    .line 15
    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Lkx4;

    .line 23
    .line 24
    move-object/from16 v1, p2

    .line 25
    .line 26
    check-cast v1, Llp2;

    .line 27
    .line 28
    move-object/from16 v8, p3

    .line 29
    .line 30
    check-cast v8, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v7}, Llp2;->W(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-ne v7, v6, :cond_0

    .line 43
    .line 44
    new-instance v7, Lxz4;

    .line 45
    .line 46
    invoke-direct {v7}, Lxz4;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    move-object v12, v7

    .line 53
    check-cast v12, Lxz4;

    .line 54
    .line 55
    invoke-static {v5, v12, v4}, Lqb3;->a(Lkx4;Lxz4;Ltb3;)Lkx4;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    new-instance v8, Lzw0;

    .line 60
    .line 61
    iget-object v9, v0, Lau0;->f0:Ldn2;

    .line 62
    .line 63
    move-object v10, v3

    .line 64
    check-cast v10, Ldn2;

    .line 65
    .line 66
    const/4 v11, 0x0

    .line 67
    iget-boolean v13, v0, Lau0;->Z:Z

    .line 68
    .line 69
    invoke-direct/range {v8 .. v13}, Lzw0;-><init>(Ldn2;Ldn2;Ltb3;Lxz4;Z)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v4, v8}, Lkx4;->y(Lkx4;)Lkx4;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v1, v2}, Llp2;->p(Z)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_0
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, Lkx4;

    .line 83
    .line 84
    move-object/from16 v1, p2

    .line 85
    .line 86
    check-cast v1, Llp2;

    .line 87
    .line 88
    move-object/from16 v8, p3

    .line 89
    .line 90
    check-cast v8, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v7}, Llp2;->W(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-ne v7, v6, :cond_1

    .line 103
    .line 104
    new-instance v7, Lxz4;

    .line 105
    .line 106
    invoke-direct {v7}, Lxz4;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    move-object v9, v7

    .line 113
    check-cast v9, Lxz4;

    .line 114
    .line 115
    invoke-static {v5, v9, v4}, Lqb3;->a(Lkx4;Lxz4;Ltb3;)Lkx4;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    new-instance v8, Lyt0;

    .line 120
    .line 121
    move-object v14, v3

    .line 122
    check-cast v14, Lkl6;

    .line 123
    .line 124
    iget-object v15, v0, Lau0;->f0:Ldn2;

    .line 125
    .line 126
    const/4 v10, 0x0

    .line 127
    const/4 v11, 0x0

    .line 128
    iget-boolean v12, v0, Lau0;->Z:Z

    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    invoke-direct/range {v8 .. v15}, Lyt0;-><init>(Lxz4;Ltb3;ZZLjava/lang/String;Lkl6;Ldn2;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v4, v8}, Lkx4;->y(Lkx4;)Lkx4;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v1, v2}, Llp2;->p(Z)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
