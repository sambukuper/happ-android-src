.class public final synthetic Lj82;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lr51;


# instance fields
.field public final synthetic X:Landroid/content/Context;

.field public final synthetic Y:Landroid/content/Intent;

.field public final synthetic Z:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/Intent;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj82;->X:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lj82;->Y:Landroid/content/Intent;

    .line 7
    .line 8
    iput-boolean p3, p0, Lj82;->Z:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Lfb9;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lzc1;->T()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x192

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lj82;->X:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v0, p0, Lj82;->Y:Landroid/content/Intent;

    .line 25
    .line 26
    iget-boolean p0, p0, Lj82;->Z:Z

    .line 27
    .line 28
    invoke-static {p1, v0, p0}, Ldq;->j(Landroid/content/Context;Landroid/content/Intent;Z)Lfb9;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance p1, Lnd;

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    invoke-direct {p1, v0}, Lnd;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lu52;

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-direct {v0, v1}, Lu52;-><init>(B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1, v0}, Lfb9;->d(Ljava/util/concurrent/Executor;Lr51;)Lfb9;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_1
    :goto_0
    return-object p1
.end method
