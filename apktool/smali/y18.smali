.class public final Ly18;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:[Lk82;

.field public b:Z

.field public c:C

.field public d:Ljava/lang/Object;


# virtual methods
.method public a()Ly18;
    .locals 4

    .line 1
    iget-object v0, p0, Ly18;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzc6;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const-string v1, "execute parameter required"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lw45;->n(ZLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ly18;

    .line 16
    .line 17
    iget-object v1, p0, Ly18;->a:[Lk82;

    .line 18
    .line 19
    iget-boolean v2, p0, Ly18;->b:Z

    .line 20
    .line 21
    iget-char v3, p0, Ly18;->c:C

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p0, v0, Ly18;->d:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v1, v0, Ly18;->a:[Lk82;

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    :cond_1
    iput-boolean p0, v0, Ly18;->b:Z

    .line 37
    .line 38
    iput-char v3, v0, Ly18;->c:C

    .line 39
    .line 40
    return-object v0
.end method
