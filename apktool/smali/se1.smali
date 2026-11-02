.class public final synthetic Lse1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lry0;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Le26;


# direct methods
.method public synthetic constructor <init>(Le26;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lse1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lse1;->Y:Le26;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Ly5;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lse1;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lse1;->Y:Le26;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->a(Le26;Ly5;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    new-instance v0, Lue1;

    .line 14
    .line 15
    const-class v1, Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ly5;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/content/Context;

    .line 22
    .line 23
    const-class v2, Lxa2;

    .line 24
    .line 25
    invoke-virtual {p1, v2}, Ly5;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lxa2;

    .line 30
    .line 31
    invoke-virtual {v2}, Lxa2;->c()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-class v3, Lpz2;

    .line 36
    .line 37
    invoke-static {v3}, Le26;->a(Ljava/lang/Class;)Le26;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {p1, v3}, Ly5;->e(Le26;)Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-class v4, Lrg1;

    .line 46
    .line 47
    invoke-virtual {p1, v4}, Ly5;->f(Ljava/lang/Class;)Lw06;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {p1, p0}, Ly5;->k(Le26;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    move-object v5, p0

    .line 56
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 57
    .line 58
    invoke-direct/range {v0 .. v5}, Lue1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lw06;Ljava/util/concurrent/Executor;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
