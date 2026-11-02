.class public abstract Lhr;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lx;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lhr;->a:Lox1;

    .line 15
    .line 16
    return-void
.end method
