.class public final Lsu/happ/proxyutility/firebase/FirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsu/happ/proxyutility/firebase/FirebaseMessagingService;",
        "Lcom/google/firebase/messaging/FirebaseMessagingService;",
        "<init>",
        "()V",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic n0:I


# instance fields
.field public final k0:Lm51;

.field public final l0:Lvz7;

.field public final m0:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lpw7;->b()Low7;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ltp1;->a:Lnf1;

    .line 9
    .line 10
    sget-object v1, Ldm4;->a:Lhv2;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lsu/happ/proxyutility/firebase/FirebaseMessagingService;->k0:Lm51;

    .line 21
    .line 22
    new-instance v0, Ltb2;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lvz7;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lsu/happ/proxyutility/firebase/FirebaseMessagingService;->l0:Lvz7;

    .line 34
    .line 35
    new-instance v0, Lj72;

    .line 36
    .line 37
    const/4 v1, 0x7

    .line 38
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lvz7;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lsu/happ/proxyutility/firebase/FirebaseMessagingService;->m0:Lvz7;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final d(Lhd6;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lhd6;->c()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "type-push"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v1, Lkd6;->X:Lg55;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v1, "force"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    sget-object v0, Lkd6;->Y:Lkd6;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v0, Lkd6;->Z:Lkd6;

    .line 42
    .line 43
    :goto_0
    move-object v4, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v4, v5

    .line 46
    :goto_1
    const/4 v0, 0x3

    .line 47
    iget-object v7, p0, Lsu/happ/proxyutility/firebase/FirebaseMessagingService;->k0:Lm51;

    .line 48
    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    new-instance v1, Lr0;

    .line 52
    .line 53
    const/16 v6, 0x12

    .line 54
    .line 55
    move-object v2, p0

    .line 56
    move-object v3, p1

    .line 57
    invoke-direct/range {v1 .. v6}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v7, v5, v1, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    move-object v2, p0

    .line 65
    move-object v3, p1

    .line 66
    invoke-virtual {v3}, Lhd6;->c()Ljava/util/HashMap;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string p1, "remote-control-type"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Ljava/lang/String;

    .line 77
    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    sget-object p1, Lad6;->Y:Lg55;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    sget-object p1, Lad6;->f0:Ln22;

    .line 95
    .line 96
    invoke-virtual {p1}, Lz1;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    move-object v4, v1

    .line 111
    check-cast v4, Lad6;

    .line 112
    .line 113
    iget-object v4, v4, Lad6;->X:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    move-object v1, v5

    .line 123
    :goto_2
    move-object p0, v1

    .line 124
    check-cast p0, Lad6;

    .line 125
    .line 126
    move-object v4, p0

    .line 127
    goto :goto_3

    .line 128
    :cond_5
    move-object v4, v5

    .line 129
    :goto_3
    if-eqz v4, :cond_6

    .line 130
    .line 131
    new-instance v1, Lr0;

    .line 132
    .line 133
    const/16 v6, 0x13

    .line 134
    .line 135
    invoke-direct/range {v1 .. v6}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 136
    .line 137
    .line 138
    invoke-static {v7, v5, v1, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 139
    .line 140
    .line 141
    :cond_6
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
