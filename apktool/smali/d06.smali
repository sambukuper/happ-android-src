.class public final Ld06;
.super Lwb4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final e:Lfk2;


# direct methods
.method public constructor <init>(Lfk2;Lw15;Lux4;Lke7;)V
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
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, p2, p3, p4, v0}, Lwb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ld06;->e:Lfk2;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final c()Lfk2;
    .locals 0

    .line 1
    iget-object p0, p0, Ld06;->e:Lfk2;

    .line 2
    .line 3
    return-object p0
.end method
