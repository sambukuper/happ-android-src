.class public final Lza5;
.super Laq7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Laq7;

.field public final h0:Lcn2;

.field public i0:Z


# direct methods
.method public constructor <init>(Laq7;Lcn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Laq7;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lza5;->g0:Laq7;

    .line 5
    .line 6
    iput-object p2, p0, Lza5;->h0:Lcn2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lza5;->i0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lza5;->g0:Laq7;

    .line 7
    .line 8
    invoke-interface {p0}, Lu85;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f(Liv5;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lza5;->g0:Laq7;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Laq7;->f(Liv5;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lza5;->i0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lza5;->i0:Z

    .line 11
    .line 12
    iget-object p0, p0, Lza5;->g0:Laq7;

    .line 13
    .line 14
    invoke-interface {p0, p1}, Lu85;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lza5;->h0:Lcn2;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcn2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object p0, p0, Lza5;->g0:Laq7;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lu85;->onNext(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-static {v0}, Lvr3;->c0(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Laq7;->c()V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, Lma5;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lza5;->onError(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
