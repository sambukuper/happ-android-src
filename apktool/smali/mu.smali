.class public final Lmu;
.super Lsi8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvh8;Ld50;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lsi8;-><init>(Lvh8;Ld50;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lmu;->c:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ld50;)Lri8;
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
    new-instance v0, Lmu;

    .line 7
    .line 8
    iget-object v1, p0, Lsi8;->a:Lvh8;

    .line 9
    .line 10
    iget-object p0, p0, Lmu;->c:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, v1, p1, p0}, Lmu;-><init>(Lvh8;Ld50;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lmu;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
