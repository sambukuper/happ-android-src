.class public final Lf94;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Lo84;

.field public b:La94;


# virtual methods
.method public final a(Ld94;Ln84;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ln84;->a()Lo84;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lf94;->a:Lo84;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gez v2, :cond_0

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    :cond_0
    iput-object v1, p0, Lf94;->a:Lo84;

    .line 15
    .line 16
    iget-object v1, p0, Lf94;->b:La94;

    .line 17
    .line 18
    invoke-interface {v1, p1, p2}, La94;->k(Ld94;Ln84;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lf94;->a:Lo84;

    .line 22
    .line 23
    return-void
.end method
