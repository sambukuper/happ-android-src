.class public final synthetic Leh;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ly05;


# direct methods
.method public synthetic constructor <init>(Ly05;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Leh;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Leh;->Y:Ly05;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Leh;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const-string v2, "Required value was null."

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object p0, p0, Leh;->Y:Ly05;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ly24;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ly24;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    move-object v3, p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v2}, Lzc3;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lb61;->n()V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-object v3

    .line 37
    :pswitch_1
    new-instance v0, Ly64;

    .line 38
    .line 39
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lgn2;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Ly64;-><init>(Lgn2;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_2
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ldn2;

    .line 54
    .line 55
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lz64;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    xor-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {p0, v0}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :pswitch_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-interface {p0, v0}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    :pswitch_5
    if-eqz p0, :cond_1

    .line 89
    .line 90
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    move-object v3, p0

    .line 95
    check-cast v3, Ljava/util/List;

    .line 96
    .line 97
    :cond_1
    return-object v3

    .line 98
    :pswitch_6
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Ly24;

    .line 103
    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    move-object v3, p0

    .line 107
    goto :goto_1

    .line 108
    :cond_2
    invoke-static {v2}, Lzc3;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lb61;->n()V

    .line 112
    .line 113
    .line 114
    :goto_1
    return-object v3

    .line 115
    :pswitch_7
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Ly24;

    .line 120
    .line 121
    if-eqz p0, :cond_3

    .line 122
    .line 123
    move-object v3, p0

    .line 124
    goto :goto_2

    .line 125
    :cond_3
    invoke-static {v2}, Lzc3;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lb61;->n()V

    .line 129
    .line 130
    .line 131
    :goto_2
    return-object v3

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
