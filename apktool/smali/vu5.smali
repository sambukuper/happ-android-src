.class public final Lvu5;
.super Ljava/util/AbstractMap$SimpleEntry;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic X:Lwu5;


# direct methods
.method public constructor <init>(Lwu5;Lsu5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvu5;->X:Lwu5;

    .line 2
    .line 3
    iget-object p1, p2, Lsu5;->X:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p2}, Lsu5;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractMap$SimpleEntry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lvu5;->X:Lwu5;

    .line 7
    .line 8
    invoke-virtual {v2, v0, p1, v1}, Lwu5;->g(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractMap$SimpleEntry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
