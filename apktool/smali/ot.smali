.class public final Lot;
.super Ltv0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lnt;


# direct methods
.method public constructor <init>(Low3;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ltv0;-><init>(Low3;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnt;

    .line 5
    .line 6
    invoke-interface {p1}, Low3;->d()Le37;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1}, Llb4;-><init>(Le37;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lot;->b:Lnt;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final d()Le37;
    .locals 0

    .line 1
    iget-object p0, p0, Lot;->b:Lnt;

    .line 2
    .line 3
    return-object p0
.end method
