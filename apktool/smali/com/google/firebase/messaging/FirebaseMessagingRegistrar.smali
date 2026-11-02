.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Le26;Ly5;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(Le26;Lny0;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Le26;Lny0;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    const-class v1, Lxa2;

    .line 4
    .line 5
    invoke-interface {p1, v1}, Lny0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lxa2;

    .line 10
    .line 11
    const-class v2, Lpb2;

    .line 12
    .line 13
    invoke-interface {p1, v2}, Lny0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const-class v2, Lrg1;

    .line 20
    .line 21
    invoke-interface {p1, v2}, Lny0;->f(Ljava/lang/Class;)Lw06;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-class v3, Lrz2;

    .line 26
    .line 27
    invoke-interface {p1, v3}, Lny0;->f(Ljava/lang/Class;)Lw06;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-class v4, Lnb2;

    .line 32
    .line 33
    invoke-interface {p1, v4}, Lny0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lnb2;

    .line 38
    .line 39
    invoke-interface {p1, p0}, Lny0;->j(Le26;)Lw06;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-class p0, Lbq7;

    .line 44
    .line 45
    invoke-interface {p1, p0}, Lny0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    move-object v6, p0

    .line 50
    check-cast v6, Lbq7;

    .line 51
    .line 52
    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lxa2;Lw06;Lw06;Lnb2;Lw06;Lbq7;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_0
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcy0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Le26;

    .line 2
    .line 3
    const-class v0, Lre8;

    .line 4
    .line 5
    const-class v1, Lue8;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Le26;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lby0;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    new-array v2, v1, [Ljava/lang/Class;

    .line 14
    .line 15
    const-class v3, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 16
    .line 17
    invoke-direct {v0, v3, v2}, Lby0;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fire-fcm"

    .line 21
    .line 22
    iput-object v2, v0, Lby0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    const-class v3, Lxa2;

    .line 25
    .line 26
    invoke-static {v3}, Lli1;->a(Ljava/lang/Class;)Lli1;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0, v3}, Lby0;->a(Lli1;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Lli1;

    .line 34
    .line 35
    const-class v4, Lpb2;

    .line 36
    .line 37
    invoke-direct {v3, v1, v1, v4}, Lli1;-><init>(IILjava/lang/Class;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v3}, Lby0;->a(Lli1;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Lli1;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    const-class v5, Lrg1;

    .line 47
    .line 48
    invoke-direct {v3, v1, v4, v5}, Lli1;-><init>(IILjava/lang/Class;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v3}, Lby0;->a(Lli1;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lli1;

    .line 55
    .line 56
    const-class v5, Lrz2;

    .line 57
    .line 58
    invoke-direct {v3, v1, v4, v5}, Lli1;-><init>(IILjava/lang/Class;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lby0;->a(Lli1;)V

    .line 62
    .line 63
    .line 64
    const-class v3, Lnb2;

    .line 65
    .line 66
    invoke-static {v3}, Lli1;->a(Ljava/lang/Class;)Lli1;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v0, v3}, Lby0;->a(Lli1;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lli1;

    .line 74
    .line 75
    invoke-direct {v3, p0, v1, v4}, Lli1;-><init>(Le26;II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v3}, Lby0;->a(Lli1;)V

    .line 79
    .line 80
    .line 81
    const-class v1, Lbq7;

    .line 82
    .line 83
    invoke-static {v1}, Lli1;->a(Ljava/lang/Class;)Lli1;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Lby0;->a(Lli1;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Lse1;

    .line 91
    .line 92
    invoke-direct {v1, p0, v4}, Lse1;-><init>(Le26;B)V

    .line 93
    .line 94
    .line 95
    iput-object v1, v0, Lby0;->g:Ljava/lang/Object;

    .line 96
    .line 97
    iget-boolean p0, v0, Lby0;->a:Z

    .line 98
    .line 99
    if-nez p0, :cond_0

    .line 100
    .line 101
    iput-boolean v4, v0, Lby0;->a:Z

    .line 102
    .line 103
    invoke-virtual {v0}, Lby0;->b()Lcy0;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-string v0, "25.1.3"

    .line 108
    .line 109
    invoke-static {v2, v0}, Lu70;->C(Ljava/lang/String;Ljava/lang/String;)Lcy0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    filled-new-array {p0, v0}, [Lcy0;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :cond_0
    const-string p0, "Instantiation type has already been set."

    .line 123
    .line 124
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 p0, 0x0

    .line 128
    return-object p0
.end method
