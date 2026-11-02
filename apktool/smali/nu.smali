.class public Lnu;
.super Lku;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvh8;Ld50;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lku;-><init>(Lvh8;Ld50;B)V

    .line 3
    .line 4
    .line 5
    iput-object p3, p0, Lnu;->e:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ld50;)Lri8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnu;->h(Ld50;)Lnu;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnu;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public c()Ltr3;
    .locals 0

    .line 1
    sget-object p0, Ltr3;->X:Ltr3;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic g(Ld50;)Lku;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnu;->h(Ld50;)Lnu;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public h(Ld50;)Lnu;
    .locals 2

    .line 1
    iget-object v0, p0, Lsi8;->b:Ld50;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lnu;

    .line 7
    .line 8
    iget-object v1, p0, Lsi8;->a:Lvh8;

    .line 9
    .line 10
    iget-object p0, p0, Lnu;->e:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, v1, p1, p0}, Lnu;-><init>(Lvh8;Ld50;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
