.class public final Lt95;
.super Lk25;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final d:Lu95;

.field public e:Z


# direct methods
.method public constructor <init>(Lu95;Lv95;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lu95;->b:Z

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lk25;->a:Lys0;

    .line 7
    .line 8
    iput-boolean v0, p0, Lk25;->b:Z

    .line 9
    .line 10
    iput-object p1, p0, Lt95;->d:Lu95;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lt95;->e:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Lt95;->d:Lu95;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu95;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    iget-object p0, p0, Lt95;->d:Lu95;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu95;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Li25;)V
    .locals 1

    .line 1
    new-instance v0, Lj00;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lj00;-><init>(Li25;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lt95;->d:Lu95;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lu95;->c(Lj00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d(Li25;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj00;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lj00;-><init>(Li25;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lt95;->d:Lu95;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lu95;->d(Lj00;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final g(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lt95;->e:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lt95;->d:Lu95;

    .line 6
    .line 7
    iget-boolean p1, p1, Lu95;->b:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lk25;->f(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
