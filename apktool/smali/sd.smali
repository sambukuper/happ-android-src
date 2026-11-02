.class public final Lsd;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lsd;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lsd;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Lmq5;Lq51;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lsd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    sget-object v3, Lc71;->X:Lc71;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, Lsd;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Lco;

    .line 15
    .line 16
    check-cast p0, Ly48;

    .line 17
    .line 18
    const/16 v1, 0xd

    .line 19
    .line 20
    invoke-direct {v0, p0, p1, v4, v1}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p2}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-ne p0, v3, :cond_0

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    :cond_0
    return-object v2

    .line 31
    :pswitch_0
    new-instance v5, Lal5;

    .line 32
    .line 33
    move-object v7, p0

    .line 34
    check-cast v7, Ll38;

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    const/16 v12, 0x16

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    const-class v8, Ll38;

    .line 41
    .line 42
    const-string v9, "tryShowContextMenu"

    .line 43
    .line 44
    const-string v10, "tryShowContextMenu-k-4lQ0M(J)V"

    .line 45
    .line 46
    invoke-direct/range {v5 .. v12}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lrd;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    invoke-direct {p0, v5, v4, v0}, Lrd;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p0, p2}, Lmb6;->i(Lmq5;Lrn2;Lq51;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-ne p0, v3, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object p0, v2

    .line 63
    :goto_0
    if-ne p0, v3, :cond_2

    .line 64
    .line 65
    move-object v2, p0

    .line 66
    :cond_2
    return-object v2

    .line 67
    :pswitch_1
    new-instance v0, Lat5;

    .line 68
    .line 69
    check-cast p0, Lsm7;

    .line 70
    .line 71
    invoke-direct {v0, p0, v4}, Lat5;-><init>(Lsm7;Lq51;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v0, p2}, Lmb6;->i(Lmq5;Lrn2;Lq51;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v3, :cond_3

    .line 79
    .line 80
    move-object v2, p0

    .line 81
    :cond_3
    return-object v2

    .line 82
    :pswitch_2
    new-instance v0, Llo4;

    .line 83
    .line 84
    check-cast p0, Lwb7;

    .line 85
    .line 86
    invoke-direct {v0, p0, v4}, Llo4;-><init>(Lwb7;Lq51;)V

    .line 87
    .line 88
    .line 89
    new-instance v4, Lrb7;

    .line 90
    .line 91
    invoke-direct {v4, p0, v1}, Lrb7;-><init>(Lwb7;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1, v0, v4, p2, v1}, Lq18;->d(Lmq5;Llo4;Lgn2;Lq51;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-ne p0, v3, :cond_4

    .line 99
    .line 100
    move-object v2, p0

    .line 101
    :cond_4
    return-object v2

    .line 102
    :pswitch_3
    check-cast p0, Ldn2;

    .line 103
    .line 104
    new-instance v0, Lxo;

    .line 105
    .line 106
    invoke-direct {v0, p0, v1}, Lxo;-><init>(Ldn2;B)V

    .line 107
    .line 108
    .line 109
    const/4 p0, 0x7

    .line 110
    invoke-static {p1, v4, v0, p2, p0}, Lq18;->d(Lmq5;Llo4;Lgn2;Lq51;I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v3, :cond_5

    .line 115
    .line 116
    move-object v2, p0

    .line 117
    :cond_5
    return-object v2

    .line 118
    :pswitch_4
    new-instance v0, Lrd;

    .line 119
    .line 120
    check-cast p0, Ltd;

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    invoke-direct {v0, p0, v4, v1}, Lrd;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v0, p2}, Lmb6;->i(Lmq5;Lrn2;Lq51;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-ne p0, v3, :cond_6

    .line 131
    .line 132
    move-object v2, p0

    .line 133
    :cond_6
    return-object v2

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
