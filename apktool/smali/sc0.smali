.class public final Lsc0;
.super Lb11;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lrj2;

.field public final c:Lli5;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb11;-><init>(Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lb11;->a()Lrj2;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lsc0;->b:Lrj2;

    .line 9
    .line 10
    invoke-super {p0}, Lb11;->b()Lli5;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lsc0;->c:Lli5;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Lrj2;
    .locals 0

    .line 1
    iget-object p0, p0, Lsc0;->b:Lrj2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Lli5;
    .locals 0

    .line 1
    iget-object p0, p0, Lsc0;->c:Lli5;

    .line 2
    .line 3
    return-object p0
.end method
