.class public abstract Lg24;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbo2;
.implements Ljava/io/Serializable;


# instance fields
.field public final X:B


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, Lg24;->X:B

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final t()I
    .locals 0

    .line 1
    iget-byte p0, p0, Lg24;->X:B

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lyb6;->a:Lzb6;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lzb6;->j(Lg24;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method
