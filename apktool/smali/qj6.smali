.class public abstract Lqj6;
.super Lnj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbo2;


# instance fields
.field public final Y:B


# direct methods
.method public constructor <init>(ILq51;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lnj6;-><init>(Lq51;)V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, Lqj6;->Y:B

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final t()I
    .locals 0

    .line 1
    iget-byte p0, p0, Lqj6;->Y:B

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr10;->X:Lq51;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lyb6;->a:Lzb6;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lzb6;->i(Lbo2;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-super {p0}, Lr10;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
