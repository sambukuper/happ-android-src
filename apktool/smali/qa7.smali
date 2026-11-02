.class public abstract synthetic Lqa7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static a(Landroid/content/Context;)Lv76;
    .locals 3

    .line 1
    new-instance v0, Lf63;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lf63;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, v0, Lf63;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lr72;

    .line 9
    .line 10
    sget-object v1, Lra7;->a:Lf4;

    .line 11
    .line 12
    sget-object v2, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    iget-object p0, p0, Lr72;->a:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lf63;->k()Lv76;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
