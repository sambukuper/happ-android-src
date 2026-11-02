.class public final Lqz7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:[B

.field public b:[B

.field public c:[B

.field public d:J


# virtual methods
.method public final a([B)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lqz7;->b:[B

    .line 5
    .line 6
    invoke-static {v0, p1}, Leu;->B0([B[B)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lci8;->h([B)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lqz7;->b:[B

    .line 15
    .line 16
    return-void
.end method

.method public final b([B)V
    .locals 2

    .line 1
    iget-object v0, p0, Lqz7;->a:[B

    .line 2
    .line 3
    invoke-static {v0, p1}, Lci8;->I([B[B)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    iput-object v0, p0, Lqz7;->a:[B

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, [B

    .line 22
    .line 23
    iput-object p1, p0, Lqz7;->c:[B

    .line 24
    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    iput-wide v0, p0, Lqz7;->d:J

    .line 28
    .line 29
    return-void
.end method
