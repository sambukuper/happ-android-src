.class public final Lf39;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements La94;


# instance fields
.field public final synthetic X:Lg94;

.field public final synthetic Y:Lmm0;

.field public final synthetic Z:Ldn2;


# direct methods
.method public constructor <init>(Lg94;Lmm0;Ldn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf39;->X:Lg94;

    .line 5
    .line 6
    iput-object p2, p0, Lf39;->Y:Lmm0;

    .line 7
    .line 8
    iput-object p3, p0, Lf39;->Z:Ldn2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final k(Ld94;Ln84;)V
    .locals 2

    .line 1
    sget-object p1, Ln84;->Companion:Ll84;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p1, Ln84;->ON_RESUME:Ln84;

    .line 7
    .line 8
    iget-object v0, p0, Lf39;->Y:Lmm0;

    .line 9
    .line 10
    iget-object v1, p0, Lf39;->X:Lg94;

    .line 11
    .line 12
    if-ne p2, p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Lg94;->f(Lc94;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lf39;->Z:Ldn2;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    new-instance p1, Lrj6;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object p0, p1

    .line 31
    :goto_0
    invoke-virtual {v0, p0}, Lmm0;->f(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    sget-object p1, Ln84;->ON_DESTROY:Ln84;

    .line 36
    .line 37
    if-ne p2, p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Lg94;->f(Lc94;)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Lv84;

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lrj6;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lmm0;->f(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
.end method
