.class public final Lhp1;
.super Lui8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lui8;

.field public final c:Lui8;


# direct methods
.method public constructor <init>(Lui8;Lui8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhp1;->b:Lui8;

    .line 5
    .line 6
    iput-object p2, p0, Lhp1;->c:Lui8;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lhp1;->b:Lui8;

    .line 2
    .line 3
    invoke-virtual {v0}, Lui8;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lhp1;->c:Lui8;

    .line 10
    .line 11
    invoke-virtual {p0}, Lui8;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lhp1;->b:Lui8;

    .line 2
    .line 3
    invoke-virtual {v0}, Lui8;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lhp1;->c:Lui8;

    .line 10
    .line 11
    invoke-virtual {p0}, Lui8;->b()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final c(Lsm;)Lsm;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhp1;->b:Lui8;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lui8;->c(Lsm;)Lsm;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, Lhp1;->c:Lui8;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lui8;->c(Lsm;)Lsm;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final d(Lt14;)Lni8;
    .locals 1

    .line 1
    iget-object v0, p0, Lhp1;->b:Lui8;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lui8;->d(Lt14;)Lni8;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lhp1;->c:Lui8;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lui8;->d(Lt14;)Lni8;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    return-object v0
.end method

.method public final f(Lt14;Lrt8;)Lt14;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lhp1;->b:Lui8;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lui8;->f(Lt14;Lrt8;)Lt14;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, Lhp1;->c:Lui8;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lui8;->f(Lt14;Lrt8;)Lt14;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
